package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFN_M15 {
public MSH MessageHeader;
public SFT SoftwareSegment;
public UAC UserAuthenticationCredentialSegment;
public MFI MasterFileIdentification;
public MFE MasterFileEntry;
public IIM InventoryItemMaster;

    public MSH getMessageHeader() {
        return MessageHeader;
    }

    public void setMessageHeader(MSH messageHeader) {
        MessageHeader = messageHeader;
    }

    public SFT getSoftwareSegment() {
        return SoftwareSegment;
    }

    public void setSoftwareSegment(SFT softwareSegment) {
        SoftwareSegment = softwareSegment;
    }

    public UAC getUserAuthenticationCredentialSegment() {
        return UserAuthenticationCredentialSegment;
    }

    public void setUserAuthenticationCredentialSegment(UAC userAuthenticationCredentialSegment) {
        UserAuthenticationCredentialSegment = userAuthenticationCredentialSegment;
    }

    public MFI getMasterFileIdentification() {
        return MasterFileIdentification;
    }

    public void setMasterFileIdentification(MFI masterFileIdentification) {
        MasterFileIdentification = masterFileIdentification;
    }

    public MFE getMasterFileEntry() {
        return MasterFileEntry;
    }

    public void setMasterFileEntry(MFE masterFileEntry) {
        MasterFileEntry = masterFileEntry;
    }

    public IIM getInventoryItemMaster() {
        return InventoryItemMaster;
    }

    public void setInventoryItemMaster(IIM inventoryItemMaster) {
        InventoryItemMaster = inventoryItemMaster;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

