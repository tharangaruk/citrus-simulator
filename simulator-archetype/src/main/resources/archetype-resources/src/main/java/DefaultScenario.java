package ${package};

import om.consol.citrus.simulator.scenario.Scenario;
import com.consol.citrus.simulator.http.SimulatorRestScenario;

@Scenario("DefaultScenario")
public class DefaultScenario extends SimulatorRestScenario {

    @Override
    protected void configure() {
        echo("Default scenario was started");

        scenario()
            .receive();

        scenario()
            .send()
            .payload("OK");

        echo("Received request");
    }
}