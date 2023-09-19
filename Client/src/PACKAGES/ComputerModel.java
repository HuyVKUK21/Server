package PACKAGES;

import java.util.Date;

/**
 *
 * @author Nguyen minh tien_1601702
 */
public class ComputerModel {
    private String ip;
    private String name;
    private int port;
    private Date date;

    public ComputerModel() {
    }
    
    
    public ComputerModel(String ip, String name) {
        this.ip = ip;
        this.name = name;
    }
    /**
     * @return the ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip the ip to set
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the port
     */
    public int getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(int port) {
        this.port = port;
    }
      public Date getDate() {
        return date;
    }

   
    public void setDate(Date date) {
        this.date = date;
    }
    
}
