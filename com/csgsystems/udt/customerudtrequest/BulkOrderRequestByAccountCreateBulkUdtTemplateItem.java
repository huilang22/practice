/*
 * Generated code DO NOT EDIT
 * Generated file: BulkOrderRequestByAccountCreateBulkUdtTemplateItem.java
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
 * Class used to create a BulkOrderRequestByAccountCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BulkOrderRequestByAccountCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectData _BatchRequest;
  protected AccountObjectData[] _Account;
  protected BulkUdtTemplateRootRequest UDTTemplate;
  protected String XMLParticipantFileName;
  protected String CDFParticipantFileName;
  protected BulkParticipantQuery AccountQuery;
  protected Integer HierarchyId;
  protected Integer InvElementDef;
  protected String InvSwapElementFileName;
  protected String EquipExternalIdFileName;
  protected Integer GlobalPkgParentAccountInternalId;
  protected Integer GenerateWorkflow;
  protected Integer TestParticipantCount;
  protected String InvElementFileName;
/**
 *
 * Constructor to create a  BulkOrderRequestByAccountCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BulkOrderRequestByAccountCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectData _BatchRequestIn, AccountObjectData[] _AccountIn, BulkUdtTemplateRootRequest UDTTemplateIn, String XMLParticipantFileNameIn, String CDFParticipantFileNameIn, BulkParticipantQuery AccountQueryIn, Integer HierarchyIdIn, Integer InvElementDefIn, String InvSwapElementFileNameIn, String EquipExternalIdFileNameIn, Integer GlobalPkgParentAccountInternalIdIn, Integer GenerateWorkflowIn, Integer TestParticipantCountIn, String InvElementFileNameIn) {
    super(id, context, "BulkOrderRequestByAccountCreate");
    _BatchRequest = _BatchRequestIn;
    _Account = _AccountIn;
    UDTTemplate = UDTTemplateIn;
    XMLParticipantFileName = XMLParticipantFileNameIn;
    CDFParticipantFileName = CDFParticipantFileNameIn;
    AccountQuery = AccountQueryIn;
    HierarchyId = HierarchyIdIn;
    InvElementDef = InvElementDefIn;
    InvSwapElementFileName = InvSwapElementFileNameIn;
    EquipExternalIdFileName = EquipExternalIdFileNameIn;
    GlobalPkgParentAccountInternalId = GlobalPkgParentAccountInternalIdIn;
    GenerateWorkflow = GenerateWorkflowIn;
    TestParticipantCount = TestParticipantCountIn;
    InvElementFileName = InvElementFileNameIn;
  }

  public void translateToMap() {
    if (_BatchRequest != null) {
      _BatchRequest.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(_BatchRequest, new HashMap(), "BulkOrderRequest").get("BulkOrderRequest"));
    }
    if (_Account != null) {
      if (_Account != null) {
        Object[] list = new Object[_Account.length];
        for (int i = 0; i < _Account.length; i++) {
          list[i] = AccountObjectHelper.getMap(_Account[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "BulkOrderRequest");
        }
        addInput("AccountList", list);
      }
    }
    if (UDTTemplate != null) {
      addInput("UDTTemplate", UDTTemplate);
    }
    if (XMLParticipantFileName != null) {
      addInput("XMLParticipantFileName", XMLParticipantFileName);
    }
    if (CDFParticipantFileName != null) {
      addInput("CDFParticipantFileName", CDFParticipantFileName);
    }
    if (AccountQuery != null) {
      addInput("AccountQuery", AccountQuery);
    }
    if (HierarchyId != null) {
      addInput("HierarchyId", HierarchyId);
    }
    if (InvElementDef != null) {
      addInput("InvElementDef", InvElementDef);
    }
    if (InvSwapElementFileName != null) {
      addInput("InvSwapElementFileName", InvSwapElementFileName);
    }
    if (EquipExternalIdFileName != null) {
      addInput("EquipExternalIdFileName", EquipExternalIdFileName);
    }
    if (GlobalPkgParentAccountInternalId != null) {
      addInput("GlobalPkgParentAccountInternalId", GlobalPkgParentAccountInternalId);
    }
    if (GenerateWorkflow != null) {
      addInput("GenerateWorkflow", GenerateWorkflow);
    }
    if (TestParticipantCount != null) {
      addInput("TestParticipantCount", TestParticipantCount);
    }
    if (InvElementFileName != null) {
      addInput("InvElementFileName", InvElementFileName);
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param _BatchRequestIn Value of the _BatchRequest
 *
 */

  public void setBatchRequest(BatchRequestObjectData _BatchRequestIn) {
    _BatchRequest = _BatchRequestIn;
  }

/**
 *
 * Sets the Account
 * @param _AccountIn Value of the _Account
 *
 */

  public void setAccount(AccountObjectData[] _AccountIn) {
    _Account = _AccountIn;
  }

/**
 *
 * Sets the UDTTemplate
 * @param UDTTemplateIn Value of the UDTTemplate
 *
 */

  public void setUDTTemplate(BulkUdtTemplateRootRequest UDTTemplateIn) {
    UDTTemplate = UDTTemplateIn;
  }

/**
 *
 * Sets the XMLParticipantFileName
 * @param XMLParticipantFileNameIn Value of the XMLParticipantFileName
 *
 */

  public void setXMLParticipantFileName(String XMLParticipantFileNameIn) {
    XMLParticipantFileName = XMLParticipantFileNameIn;
  }

/**
 *
 * Sets the CDFParticipantFileName
 * @param CDFParticipantFileNameIn Value of the CDFParticipantFileName
 *
 */

  public void setCDFParticipantFileName(String CDFParticipantFileNameIn) {
    CDFParticipantFileName = CDFParticipantFileNameIn;
  }

/**
 *
 * Sets the AccountQuery
 * @param AccountQueryIn Value of the AccountQuery
 *
 */

  public void setAccountQuery(BulkParticipantQuery AccountQueryIn) {
    AccountQuery = AccountQueryIn;
  }

/**
 *
 * Sets the HierarchyId
 * @param HierarchyIdIn Value of the HierarchyId
 *
 */

  public void setHierarchyId(Integer HierarchyIdIn) {
    HierarchyId = HierarchyIdIn;
  }

/**
 *
 * Sets the InvElementDef
 * @param InvElementDefIn Value of the InvElementDef
 *
 */

  public void setInvElementDef(Integer InvElementDefIn) {
    InvElementDef = InvElementDefIn;
  }

/**
 *
 * Sets the InvSwapElementFileName
 * @param InvSwapElementFileNameIn Value of the InvSwapElementFileName
 *
 */

  public void setInvSwapElementFileName(String InvSwapElementFileNameIn) {
    InvSwapElementFileName = InvSwapElementFileNameIn;
  }

/**
 *
 * Sets the EquipExternalIdFileName
 * @param EquipExternalIdFileNameIn Value of the EquipExternalIdFileName
 *
 */

  public void setEquipExternalIdFileName(String EquipExternalIdFileNameIn) {
    EquipExternalIdFileName = EquipExternalIdFileNameIn;
  }

/**
 *
 * Sets the GlobalPkgParentAccountInternalId
 * @param GlobalPkgParentAccountInternalIdIn Value of the GlobalPkgParentAccountInternalId
 *
 */

  public void setGlobalPkgParentAccountInternalId(Integer GlobalPkgParentAccountInternalIdIn) {
    GlobalPkgParentAccountInternalId = GlobalPkgParentAccountInternalIdIn;
  }

/**
 *
 * Sets the GenerateWorkflow
 * @param GenerateWorkflowIn Value of the GenerateWorkflow
 *
 */

  public void setGenerateWorkflow(Integer GenerateWorkflowIn) {
    GenerateWorkflow = GenerateWorkflowIn;
  }

/**
 *
 * Sets the TestParticipantCount
 * @param TestParticipantCountIn Value of the TestParticipantCount
 *
 */

  public void setTestParticipantCount(Integer TestParticipantCountIn) {
    TestParticipantCount = TestParticipantCountIn;
  }

/**
 *
 * Sets the InvElementFileName
 * @param InvElementFileNameIn Value of the InvElementFileName
 *
 */

  public void setInvElementFileName(String InvElementFileNameIn) {
    InvElementFileName = InvElementFileNameIn;
  }

  public void translateFromMap() {
    _BatchRequest = BatchRequestObjectHelper.fromMap(inputMap, "BatchRequest");
    Object[] list = (Object[]) inputMap.get("AccountList");
    if (list != null) {
      _Account = new AccountObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        _Account[i] = AccountObjectHelper.getObj((Map) list[i]);
        _Account[i].resetFlags(true, true);
      }
    }
    UDTTemplate = (BulkUdtTemplateRootRequest)inputMap.get("UDTTemplate");
    XMLParticipantFileName = (String)inputMap.get("XMLParticipantFileName");
    CDFParticipantFileName = (String)inputMap.get("CDFParticipantFileName");
    AccountQuery = (BulkParticipantQuery)inputMap.get("AccountQuery");
    HierarchyId = (Integer)inputMap.get("HierarchyId");
    InvElementDef = (Integer)inputMap.get("InvElementDef");
    InvSwapElementFileName = (String)inputMap.get("InvSwapElementFileName");
    EquipExternalIdFileName = (String)inputMap.get("EquipExternalIdFileName");
    GlobalPkgParentAccountInternalId = (Integer)inputMap.get("GlobalPkgParentAccountInternalId");
    GenerateWorkflow = (Integer)inputMap.get("GenerateWorkflow");
    TestParticipantCount = (Integer)inputMap.get("TestParticipantCount");
    InvElementFileName = (String)inputMap.get("InvElementFileName");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectData getBatchRequest( ) {
    return _BatchRequest;
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public AccountObjectData[] getAccount( ) {
    return _Account;
  }

/**
 *
 * Gets the UDTTemplate
 * @return Value of the UDTTemplate
 *
 */

  public BulkUdtTemplateRootRequest getUDTTemplate( ) {
    return UDTTemplate;
  }

/**
 *
 * Gets the XMLParticipantFileName
 * @return Value of the XMLParticipantFileName
 *
 */

  public String getXMLParticipantFileName( ) {
    return XMLParticipantFileName;
  }

/**
 *
 * Gets the CDFParticipantFileName
 * @return Value of the CDFParticipantFileName
 *
 */

  public String getCDFParticipantFileName( ) {
    return CDFParticipantFileName;
  }

/**
 *
 * Gets the AccountQuery
 * @return Value of the AccountQuery
 *
 */

  public BulkParticipantQuery getAccountQuery( ) {
    return AccountQuery;
  }

/**
 *
 * Gets the HierarchyId
 * @return Value of the HierarchyId
 *
 */

  public Integer getHierarchyId( ) {
    return HierarchyId;
  }

/**
 *
 * Gets the InvElementDef
 * @return Value of the InvElementDef
 *
 */

  public Integer getInvElementDef( ) {
    return InvElementDef;
  }

/**
 *
 * Gets the InvSwapElementFileName
 * @return Value of the InvSwapElementFileName
 *
 */

  public String getInvSwapElementFileName( ) {
    return InvSwapElementFileName;
  }

/**
 *
 * Gets the EquipExternalIdFileName
 * @return Value of the EquipExternalIdFileName
 *
 */

  public String getEquipExternalIdFileName( ) {
    return EquipExternalIdFileName;
  }

/**
 *
 * Gets the GlobalPkgParentAccountInternalId
 * @return Value of the GlobalPkgParentAccountInternalId
 *
 */

  public Integer getGlobalPkgParentAccountInternalId( ) {
    return GlobalPkgParentAccountInternalId;
  }

/**
 *
 * Gets the GenerateWorkflow
 * @return Value of the GenerateWorkflow
 *
 */

  public Integer getGenerateWorkflow( ) {
    return GenerateWorkflow;
  }

/**
 *
 * Gets the TestParticipantCount
 * @return Value of the TestParticipantCount
 *
 */

  public Integer getTestParticipantCount( ) {
    return TestParticipantCount;
  }

/**
 *
 * Gets the InvElementFileName
 * @return Value of the InvElementFileName
 *
 */

  public String getInvElementFileName( ) {
    return InvElementFileName;
  }

}
