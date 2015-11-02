/*
 * Generated code DO NOT EDIT
 * Generated file: BulkOrderRequestByAccountUpdateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a BulkOrderRequestByAccountUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BulkOrderRequestByAccountUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectData _____BatchRequest;
  protected AccountObjectData[] ___Account;
  protected Integer __HierarchyId;
  protected Integer __InvElementDef;
  protected String __InvSwapElementFileName;
  protected String __EquipExternalIdFileName;
  protected Integer __GlobalPkgParentAccountInternalId;
  protected Integer __GenerateWorkflow;
  protected BulkUdtTemplateRootRequest __UDTTemplate;
  protected String __XMLParticipantFileName;
  protected String __CDFParticipantFileName;
  protected String __InvElementFileName;
  protected Integer __TestParticipantCount;
  protected BulkParticipantQuery __AccountQuery;
/**
 *
 * Constructor to create a  BulkOrderRequestByAccountUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BulkOrderRequestByAccountUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectData _____BatchRequestIn, AccountObjectData[] ___AccountIn, Integer __HierarchyIdIn, Integer __InvElementDefIn, String __InvSwapElementFileNameIn, String __EquipExternalIdFileNameIn, Integer __GlobalPkgParentAccountInternalIdIn, Integer __GenerateWorkflowIn, BulkUdtTemplateRootRequest __UDTTemplateIn, String __XMLParticipantFileNameIn, String __CDFParticipantFileNameIn, String __InvElementFileNameIn, Integer __TestParticipantCountIn, BulkParticipantQuery __AccountQueryIn) {
    super(id, context, "BulkOrderRequestByAccountUpdate");
    _____BatchRequest = _____BatchRequestIn;
    ___Account = ___AccountIn;
    __HierarchyId = __HierarchyIdIn;
    __InvElementDef = __InvElementDefIn;
    __InvSwapElementFileName = __InvSwapElementFileNameIn;
    __EquipExternalIdFileName = __EquipExternalIdFileNameIn;
    __GlobalPkgParentAccountInternalId = __GlobalPkgParentAccountInternalIdIn;
    __GenerateWorkflow = __GenerateWorkflowIn;
    __UDTTemplate = __UDTTemplateIn;
    __XMLParticipantFileName = __XMLParticipantFileNameIn;
    __CDFParticipantFileName = __CDFParticipantFileNameIn;
    __InvElementFileName = __InvElementFileNameIn;
    __TestParticipantCount = __TestParticipantCountIn;
    __AccountQuery = __AccountQueryIn;
  }

  public void translateToMap() {
    if (_____BatchRequest != null) {
      _____BatchRequest.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(_____BatchRequest, new HashMap(), "BulkOrderRequest").get("BulkOrderRequest"));
    }
    if (___Account != null) {
      if (___Account != null) {
        Object[] list = new Object[___Account.length];
        for (int i = 0; i < ___Account.length; i++) {
          list[i] = AccountObjectHelper.getMap(___Account[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "BulkOrderRequest");
        }
        addInput("AccountList", list);
      }
    }
    if (__HierarchyId != null) {
      addInput("HierarchyId", __HierarchyId);
    }
    if (__InvElementDef != null) {
      addInput("InvElementDef", __InvElementDef);
    }
    if (__InvSwapElementFileName != null) {
      addInput("InvSwapElementFileName", __InvSwapElementFileName);
    }
    if (__EquipExternalIdFileName != null) {
      addInput("EquipExternalIdFileName", __EquipExternalIdFileName);
    }
    if (__GlobalPkgParentAccountInternalId != null) {
      addInput("GlobalPkgParentAccountInternalId", __GlobalPkgParentAccountInternalId);
    }
    if (__GenerateWorkflow != null) {
      addInput("GenerateWorkflow", __GenerateWorkflow);
    }
    if (__UDTTemplate != null) {
      addInput("UDTTemplate", __UDTTemplate);
    }
    if (__XMLParticipantFileName != null) {
      addInput("XMLParticipantFileName", __XMLParticipantFileName);
    }
    if (__CDFParticipantFileName != null) {
      addInput("CDFParticipantFileName", __CDFParticipantFileName);
    }
    if (__InvElementFileName != null) {
      addInput("InvElementFileName", __InvElementFileName);
    }
    if (__TestParticipantCount != null) {
      addInput("TestParticipantCount", __TestParticipantCount);
    }
    if (__AccountQuery != null) {
      addInput("AccountQuery", __AccountQuery);
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param _____BatchRequestIn Value of the _____BatchRequest
 *
 */

  public void setBatchRequest(BatchRequestObjectData _____BatchRequestIn) {
    _____BatchRequest = _____BatchRequestIn;
  }

/**
 *
 * Sets the Account
 * @param ___AccountIn Value of the ___Account
 *
 */

  public void setAccount(AccountObjectData[] ___AccountIn) {
    ___Account = ___AccountIn;
  }

/**
 *
 * Sets the HierarchyId
 * @param __HierarchyIdIn Value of the __HierarchyId
 *
 */

  public void setHierarchyId(Integer __HierarchyIdIn) {
    __HierarchyId = __HierarchyIdIn;
  }

/**
 *
 * Sets the InvElementDef
 * @param __InvElementDefIn Value of the __InvElementDef
 *
 */

  public void setInvElementDef(Integer __InvElementDefIn) {
    __InvElementDef = __InvElementDefIn;
  }

/**
 *
 * Sets the InvSwapElementFileName
 * @param __InvSwapElementFileNameIn Value of the __InvSwapElementFileName
 *
 */

  public void setInvSwapElementFileName(String __InvSwapElementFileNameIn) {
    __InvSwapElementFileName = __InvSwapElementFileNameIn;
  }

/**
 *
 * Sets the EquipExternalIdFileName
 * @param __EquipExternalIdFileNameIn Value of the __EquipExternalIdFileName
 *
 */

  public void setEquipExternalIdFileName(String __EquipExternalIdFileNameIn) {
    __EquipExternalIdFileName = __EquipExternalIdFileNameIn;
  }

/**
 *
 * Sets the GlobalPkgParentAccountInternalId
 * @param __GlobalPkgParentAccountInternalIdIn Value of the __GlobalPkgParentAccountInternalId
 *
 */

  public void setGlobalPkgParentAccountInternalId(Integer __GlobalPkgParentAccountInternalIdIn) {
    __GlobalPkgParentAccountInternalId = __GlobalPkgParentAccountInternalIdIn;
  }

/**
 *
 * Sets the GenerateWorkflow
 * @param __GenerateWorkflowIn Value of the __GenerateWorkflow
 *
 */

  public void setGenerateWorkflow(Integer __GenerateWorkflowIn) {
    __GenerateWorkflow = __GenerateWorkflowIn;
  }

/**
 *
 * Sets the UDTTemplate
 * @param __UDTTemplateIn Value of the __UDTTemplate
 *
 */

  public void setUDTTemplate(BulkUdtTemplateRootRequest __UDTTemplateIn) {
    __UDTTemplate = __UDTTemplateIn;
  }

/**
 *
 * Sets the XMLParticipantFileName
 * @param __XMLParticipantFileNameIn Value of the __XMLParticipantFileName
 *
 */

  public void setXMLParticipantFileName(String __XMLParticipantFileNameIn) {
    __XMLParticipantFileName = __XMLParticipantFileNameIn;
  }

/**
 *
 * Sets the CDFParticipantFileName
 * @param __CDFParticipantFileNameIn Value of the __CDFParticipantFileName
 *
 */

  public void setCDFParticipantFileName(String __CDFParticipantFileNameIn) {
    __CDFParticipantFileName = __CDFParticipantFileNameIn;
  }

/**
 *
 * Sets the InvElementFileName
 * @param __InvElementFileNameIn Value of the __InvElementFileName
 *
 */

  public void setInvElementFileName(String __InvElementFileNameIn) {
    __InvElementFileName = __InvElementFileNameIn;
  }

/**
 *
 * Sets the TestParticipantCount
 * @param __TestParticipantCountIn Value of the __TestParticipantCount
 *
 */

  public void setTestParticipantCount(Integer __TestParticipantCountIn) {
    __TestParticipantCount = __TestParticipantCountIn;
  }

/**
 *
 * Sets the AccountQuery
 * @param __AccountQueryIn Value of the __AccountQuery
 *
 */

  public void setAccountQuery(BulkParticipantQuery __AccountQueryIn) {
    __AccountQuery = __AccountQueryIn;
  }

  public void translateFromMap() {
    _____BatchRequest = BatchRequestObjectHelper.fromMap(inputMap, "BatchRequest");
    Object[] list = (Object[]) inputMap.get("AccountList");
    if (list != null) {
      ___Account = new AccountObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        ___Account[i] = AccountObjectHelper.getObj((Map) list[i]);
        ___Account[i].resetFlags(true, true);
      }
    }
    __HierarchyId = (Integer)inputMap.get("HierarchyId");
    __InvElementDef = (Integer)inputMap.get("InvElementDef");
    __InvSwapElementFileName = (String)inputMap.get("InvSwapElementFileName");
    __EquipExternalIdFileName = (String)inputMap.get("EquipExternalIdFileName");
    __GlobalPkgParentAccountInternalId = (Integer)inputMap.get("GlobalPkgParentAccountInternalId");
    __GenerateWorkflow = (Integer)inputMap.get("GenerateWorkflow");
    __UDTTemplate = (BulkUdtTemplateRootRequest)inputMap.get("UDTTemplate");
    __XMLParticipantFileName = (String)inputMap.get("XMLParticipantFileName");
    __CDFParticipantFileName = (String)inputMap.get("CDFParticipantFileName");
    __InvElementFileName = (String)inputMap.get("InvElementFileName");
    __TestParticipantCount = (Integer)inputMap.get("TestParticipantCount");
    __AccountQuery = (BulkParticipantQuery)inputMap.get("AccountQuery");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectData getBatchRequest( ) {
    return _____BatchRequest;
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public AccountObjectData[] getAccount( ) {
    return ___Account;
  }

/**
 *
 * Gets the HierarchyId
 * @return Value of the HierarchyId
 *
 */

  public Integer getHierarchyId( ) {
    return __HierarchyId;
  }

/**
 *
 * Gets the InvElementDef
 * @return Value of the InvElementDef
 *
 */

  public Integer getInvElementDef( ) {
    return __InvElementDef;
  }

/**
 *
 * Gets the InvSwapElementFileName
 * @return Value of the InvSwapElementFileName
 *
 */

  public String getInvSwapElementFileName( ) {
    return __InvSwapElementFileName;
  }

/**
 *
 * Gets the EquipExternalIdFileName
 * @return Value of the EquipExternalIdFileName
 *
 */

  public String getEquipExternalIdFileName( ) {
    return __EquipExternalIdFileName;
  }

/**
 *
 * Gets the GlobalPkgParentAccountInternalId
 * @return Value of the GlobalPkgParentAccountInternalId
 *
 */

  public Integer getGlobalPkgParentAccountInternalId( ) {
    return __GlobalPkgParentAccountInternalId;
  }

/**
 *
 * Gets the GenerateWorkflow
 * @return Value of the GenerateWorkflow
 *
 */

  public Integer getGenerateWorkflow( ) {
    return __GenerateWorkflow;
  }

/**
 *
 * Gets the UDTTemplate
 * @return Value of the UDTTemplate
 *
 */

  public BulkUdtTemplateRootRequest getUDTTemplate( ) {
    return __UDTTemplate;
  }

/**
 *
 * Gets the XMLParticipantFileName
 * @return Value of the XMLParticipantFileName
 *
 */

  public String getXMLParticipantFileName( ) {
    return __XMLParticipantFileName;
  }

/**
 *
 * Gets the CDFParticipantFileName
 * @return Value of the CDFParticipantFileName
 *
 */

  public String getCDFParticipantFileName( ) {
    return __CDFParticipantFileName;
  }

/**
 *
 * Gets the InvElementFileName
 * @return Value of the InvElementFileName
 *
 */

  public String getInvElementFileName( ) {
    return __InvElementFileName;
  }

/**
 *
 * Gets the TestParticipantCount
 * @return Value of the TestParticipantCount
 *
 */

  public Integer getTestParticipantCount( ) {
    return __TestParticipantCount;
  }

/**
 *
 * Gets the AccountQuery
 * @return Value of the AccountQuery
 *
 */

  public BulkParticipantQuery getAccountQuery( ) {
    return __AccountQuery;
  }

}
