package com.redhat.idaas.eventbuilder.pojos.financial.legacy;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SPE {
private String SPE_01_SecurityOriginatorName;
private String SPE_02_SecurityRecipientName;
private String SPE_03_SecurityTypeCode;
private String SPE_04_SecurityorAssuranceProtocolErrorCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

