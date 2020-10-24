package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PSL {
    private String PSL_1_ProviderProductServiceLineItemNumber;
    private String PSL_2_PayerProductServiceLineItemNumber;
    private String PSL_3_ProductServiceLineItemSequenceNumber;
    private String PSL_4_ProviderTrackingID;
    private String PSL_5_PayerTrackingID;
    private String PSL_6_ProductServiceLineItemStatus;
    private String PSL_7_ProductServiceCode;
    private String PSL_8_ProductServiceCodeModifier;
    private String PSL_9_ProductServiceCodeDescription;
    private String PSL_10_ProductServiceEffectiveDate;
    private String PSL_11_ProductServiceExpirationDate;
    private String PSL_12_ProductServiceQuantity;
    private String PSL_13_ProductServiceUnitCost;
    private String PSL_14_NumberofItemsperUnit;
    private String PSL_15_ProductServiceGrossAmount;
    private String PSL_16_ProductServiceBilledAmount;
    private String PSL_17_ProductServiceClarificationCodeType;
    private String PSL_18_ProductServiceClarificationCodeValue;
    private String PSL_19_HealthDocumentReferenceIdentifier;
    private String PSL_20_ProcessingConsiderationCode;
    private String PSL_21_RestrictedDisclosureIndicator;
    private String PSL_22_RelatedProductServiceCodeIndicator;
    private String PSL_23_ProductServiceAmountforPhysician;
    private String PSL_24_ProductServiceCostFactor;
    private String PSL_25_CostCenter;
    private String PSL_26_BillingPeriod;
    private String PSL_27_DayswithoutBilling;
    private String PSL_28_SessionNo;
    private String PSL_29_ExecutingPhysicianID;
    private String PSL_30_ResponsiblePhysicianID;
    private String PSL_31_RoleExecutingPhysician;
    private String PSL_32_MedicalRoleExecutingPhysician;
    private String PSL_33_Sideofbody;
    private String PSL_34_NumberofTPsPP;
    private String PSL_35_TPValuePP;
    private String PSL_36_InternalScalingFactorPP;
    private String PSL_37_ExternalScalingFactorPP;
    private String PSL_38_AmountPP;
    private String PSL_39_NumberofTPsTechnicalPart;
    private String PSL_40_TPValueTechnicalPart;
    private String PSL_41_InternalScalingFactorTechnicalPart;
    private String PSL_42_ExternalScalingFactorTechnicalPart;
    private String PSL_43_AmountTechnicalPart;
    private String PSL_44_TotalAmountProfessionalPartTechnicalPart;
    private String PSL_45_VATRate;
    private String PSL_46_MainService;
    private String PSL_47_Validation;
    private String PSL_48_Comment;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

