package com.github.lbroudoux.greeter.server.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.github.lbroudoux.greeter.server.Greeter;

@Stateless
@Remote (Greeter.class)
public class GreeterBean implements Greeter {

  @Override
  public String greet(String user) {
    try{
            return "Hello " + user + ", have a pleasant day! from EJB running on " + java.net.InetAddress.getLocalHost().getHostAddress();
      } catch(java.net.UnknownHostException exp){
            return "Hello " + user + ", have a pleasant day! but no IP.";
      }
  }
}
