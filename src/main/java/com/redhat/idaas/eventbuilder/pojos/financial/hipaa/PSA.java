package com.redhat.idaas.eventbuilder.pojos.financial.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PSA {
private String PSA_01_IdentificationCodeQualifier;
private String PSA_02_IdentificationCode;
private String PSA_03_OwnersShare;
private String PSA_04_MonetaryAmount;
private String PSA_05_AmountQualifierCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

