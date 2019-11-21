package syk.sample.drone.main;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import syk.common.MavJsonMessage;
import syk.drone.device.Device;
import syk.drone.device.FlightController;
import syk.drone.mavlink.MavLinkListener;
import syk.drone.mavlink.Messages.MAVLinkMessage;
import syk.drone.mavlink.common.msg_mission_current;
import syk.sample.drone.network.NetworkConfig;

public class SimulationMain {
    private static final Logger logger = LoggerFactory.getLogger(SimulationMain.class);
    public static void main(String[] args) {
        NetworkConfig networkConfig = new NetworkConfig();

        FlightController flightController = new FlightController();
        flightController.mavlinkConnectTcp("localhost", 5760);
        flightController.mqttConnect(
                networkConfig.mqttBrokerConnStr,
                networkConfig.droneTopic +"/fc/pub",
                networkConfig.droneTopic +"/fc/sub"
        );

        flightController.addDevice(new Device(1) { // 1 : action의 device 번호
            @Override
            public void off() {
                logger.info("chicken dettach");
            }

            @Override
            public void on() {
                logger.info("Device on");
            }
        });
    }
}
