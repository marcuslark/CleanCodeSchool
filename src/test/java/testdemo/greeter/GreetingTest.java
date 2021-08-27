package testdemo.greeter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static testdemo.greeter.Greeting.greet;

public class GreetingTest {

    @Test
    void givenAnotherPairOfNamesShouldReturnHelloName1AndName2() {
        assertThat(greet("Joakim,Frida")).isEqualTo("Hello Joakim and Frida");
    }

    @Test
    void givenTwoNamesShouldReturnHelloName1AndName2() {
        assertThat(greet("Jill,Jane")).isEqualTo("Hello Jill and Jane");
    }

    @Test
    void givenNameJERRYShouldReturnHELLOJERRY() {
        assertThat(greet("JERRY")).isEqualTo("HELLO JERRY");
    }

    @Test
    void givenNameMarcusGreetShouldReturnHelloMarcus() {
        assertThat(greet("Marcus")).isEqualTo("Hello Marcus");
    }

    @Test
    void givenNameBobGreetShouldReturnHelloBob() {
        String answer = greet("Bob");
        assertThat(answer).isEqualTo("Hello Bob");
    }

    @Test
    void givenNameANNAShouldReturnHELLOANNA() {
        assertThat(greet("ANNA")).isEqualTo("HELLO ANNA");
    }
    @Test
    void callingGreetWithNameBobShouldReturnHelloBob(){
        Greeting greeting = new Greeting();
        String answer = greet("Bob");
        assertEquals("Hello Bob", answer);
    }

    @Test
    void callingGreetWithNameMartinShouldReturnHelloMartin(){
        Greeting greeting = new Greeting();
        String answer = greet("Martin");
        assertEquals("Hello Martin", answer);
    }

    @Test
    void callingGreetWithNullAsNameShouldReturnHelloMyFriend(){
        Greeting greeting = new Greeting();
        String answer = greet(null);
        assertEquals("Hello, my friend.", answer);
    }

    @Test
    @DisplayName("Calling greet with uppercase NAME should return HELLO NAME!")
    void callingGreetWithNAMEUppercaseShouldReturnHELLONAME(){
        Greeting greeting = new Greeting();
        String answer = greet("ANNA");
        assertEquals("HELLO ANNA", answer);
    }




}
