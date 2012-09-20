/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.simop;

/**
 *
 * @author Luiz Fernando
 */
public class Station extends ArchitectureComponent{
    private String process;
    private int num_process;
    private double clock;
    private int cache;
    private double hd;
    private NetType network;

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public int getNum_process() {
        return num_process;
    }

    public void setNum_process(int num_process) {
        this.num_process = num_process;
    }

    public double getClock() {
        return clock;
    }

    public void setClock(double clock) {
        this.clock = clock;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    public double getHd() {
        return hd;
    }

    public void setHd(double hd) {
        this.hd = hd;
    }

    public NetType getNetwork() {
        return network;
    }

    public void setNetwork(NetType network) {
        this.network = network;
    }
}
