package casestudycu;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
  plugin={"json:cucumber.json"}
  )
public class run {

}
