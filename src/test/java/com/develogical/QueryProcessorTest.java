package com.develogical;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class QueryProcessorTest {

  QueryProcessor queryProcessor = new QueryProcessor();

  @Test
  public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
    assertThat(queryProcessor.process("test"), is(""));
  }

  @Test
  public void knowsAboutShakespeare() throws Exception {
    assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
  }

  @Test
  public void knowsTeamName() throws Exception {
    assertThat(queryProcessor.process("What is your name?"), containsString("RobTeam"));
  }
  @Test
  public void WhatIs75Times99() throws Exception {
    assertThat(queryProcessor.process("What is 75 multiplied by 99?"),
            containsString("7425"));
  }


  @Test
  public void MultiplyAandB() throws Exception {
    assertThat(queryProcessor.process("What is 8 multiplied by 76?"),
            containsString("608"));
  }

  @Test
  public void WhatisAMinusB() throws Exception {
    assertThat(queryProcessor.process("What is 8 minus 3?"),
            containsString("5"));
  }


}
