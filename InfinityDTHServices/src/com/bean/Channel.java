package com.bean;

public class Channel {
	private String name;
	private String band;
	private double videoCarrierFrequency;
	private double audioCarrierFrequency;
	private boolean channelChargeTypeFree;
	private boolean channelTransmissionTypeStandard;
	private double charge;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public double getVideoCarrierFrequency() {
		return videoCarrierFrequency;
	}
	public void setVideoCarrierFrequency(double videoCarrierFrequency) {
		this.videoCarrierFrequency = videoCarrierFrequency;
	}
	public double getAudioCarrierFrequency() {
		return audioCarrierFrequency;
	}
	public void setAudioCarrierFrequency(double audioCarrierFrequency) {
		this.audioCarrierFrequency = audioCarrierFrequency;
	}
	
	public boolean isChannelChargeTypeFree() {
		return channelChargeTypeFree;
	}
	public void setChannelChargeTypeFree(boolean channelChargeTypeFree) {
		this.channelChargeTypeFree = channelChargeTypeFree;
	}
	public boolean isChannelTransmissionTypeStandard() {
		return channelTransmissionTypeStandard;
	}
	public void setChannelTransmissionTypeStandard(
			boolean channelTransmissionTypeStandard) {
		this.channelTransmissionTypeStandard = channelTransmissionTypeStandard;
	}
	public double getCharge() {
		return charge;
	}
	public void setCharge(double charge) {
		this.charge = charge;
	}
}
