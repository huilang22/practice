/*
 * Generated code DO NOT EDIT
 * Generated file: BulkOrderRequestRequest.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;
import java.util.Map;
import java.util.Date;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.math.BigInteger;

import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;
public final class BulkOrderRequestRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BulkOrderRequestRequest (String request, BulkOrderRequestRequestMethod method) {
    initialize(request, "BulkOrderRequest", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BulkOrderRequestRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountForBulkOrderRequestByAccountCreate(AccountObjectData data) {
    if (data != null) {
      addInput("Account", AccountObjectHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setAccountQueryForBulkOrderRequestByAccountCreate(BulkParticipantQuery data) {
    if (data != null) {
      addInput("AccountQuery", data);
    }
  }
  public void setBatchRequestForBulkOrderRequestByAccountCreate(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setCDFParticipantFileNameForBulkOrderRequestByAccountCreate(String data) {
    if (data != null) {
      addInput("CDFParticipantFileName", data);
    }
  }
  public void setEquipExternalIdFileNameForBulkOrderRequestByAccountCreate(String data) {
    if (data != null) {
      addInput("EquipExternalIdFileName", data);
    }
  }
  public void setGenerateWorkflowForBulkOrderRequestByAccountCreate(Integer data) {
    if (data != null) {
      addInput("GenerateWorkflow", data);
    }
  }
  public void setGlobalPkgParentAccountInternalIdForBulkOrderRequestByAccountCreate(Integer data) {
    if (data != null) {
      addInput("GlobalPkgParentAccountInternalId", data);
    }
  }
  public void setHierarchyIdForBulkOrderRequestByAccountCreate(Integer data) {
    if (data != null) {
      addInput("HierarchyId", data);
    }
  }
  public void setInvElementDefForBulkOrderRequestByAccountCreate(Integer data) {
    if (data != null) {
      addInput("InvElementDef", data);
    }
  }
  public void setInvElementFileNameForBulkOrderRequestByAccountCreate(String data) {
    if (data != null) {
      addInput("InvElementFileName", data);
    }
  }
  public void setInvSwapElementFileNameForBulkOrderRequestByAccountCreate(String data) {
    if (data != null) {
      addInput("InvSwapElementFileName", data);
    }
  }
  public void setTestParticipantCountForBulkOrderRequestByAccountCreate(Integer data) {
    if (data != null) {
      addInput("TestParticipantCount", data);
    }
  }
  public void setUDTTemplateForBulkOrderRequestByAccountCreate(BulkUdtTemplateRootRequest data) {
    if (data != null) {
      addInput("UDTTemplate", data);
    }
  }
  public void setXMLParticipantFileNameForBulkOrderRequestByAccountCreate(String data) {
    if (data != null) {
      addInput("XMLParticipantFileName", data);
    }
  }
  public void setBatchRequestForBulkOrderRequestByAccountGet(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setAccountForBulkOrderRequestByAccountUpdate(AccountObjectData data) {
    if (data != null) {
      addInput("Account", AccountObjectHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setAccountQueryForBulkOrderRequestByAccountUpdate(BulkParticipantQuery data) {
    if (data != null) {
      addInput("AccountQuery", data);
    }
  }
  public void setBatchRequestForBulkOrderRequestByAccountUpdate(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setCDFParticipantFileNameForBulkOrderRequestByAccountUpdate(String data) {
    if (data != null) {
      addInput("CDFParticipantFileName", data);
    }
  }
  public void setEquipExternalIdFileNameForBulkOrderRequestByAccountUpdate(String data) {
    if (data != null) {
      addInput("EquipExternalIdFileName", data);
    }
  }
  public void setGenerateWorkflowForBulkOrderRequestByAccountUpdate(Integer data) {
    if (data != null) {
      addInput("GenerateWorkflow", data);
    }
  }
  public void setGlobalPkgParentAccountInternalIdForBulkOrderRequestByAccountUpdate(Integer data) {
    if (data != null) {
      addInput("GlobalPkgParentAccountInternalId", data);
    }
  }
  public void setHierarchyIdForBulkOrderRequestByAccountUpdate(Integer data) {
    if (data != null) {
      addInput("HierarchyId", data);
    }
  }
  public void setInvElementDefForBulkOrderRequestByAccountUpdate(Integer data) {
    if (data != null) {
      addInput("InvElementDef", data);
    }
  }
  public void setInvElementFileNameForBulkOrderRequestByAccountUpdate(String data) {
    if (data != null) {
      addInput("InvElementFileName", data);
    }
  }
  public void setInvSwapElementFileNameForBulkOrderRequestByAccountUpdate(String data) {
    if (data != null) {
      addInput("InvSwapElementFileName", data);
    }
  }
  public void setTestParticipantCountForBulkOrderRequestByAccountUpdate(Integer data) {
    if (data != null) {
      addInput("TestParticipantCount", data);
    }
  }
  public void setUDTTemplateForBulkOrderRequestByAccountUpdate(BulkUdtTemplateRootRequest data) {
    if (data != null) {
      addInput("UDTTemplate", data);
    }
  }
  public void setXMLParticipantFileNameForBulkOrderRequestByAccountUpdate(String data) {
    if (data != null) {
      addInput("XMLParticipantFileName", data);
    }
  }
  public void setBatchRequestForBulkOrderRequestByServiceCreate(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setCDFParticipantFileNameForBulkOrderRequestByServiceCreate(String data) {
    if (data != null) {
      addInput("CDFParticipantFileName", data);
    }
  }
  public void setEquipExternalIdFileNameForBulkOrderRequestByServiceCreate(String data) {
    if (data != null) {
      addInput("EquipExternalIdFileName", data);
    }
  }
  public void setGenerateWorkflowForBulkOrderRequestByServiceCreate(Integer data) {
    if (data != null) {
      addInput("GenerateWorkflow", data);
    }
  }
  public void setGlobalPkgParentAccountInternalIdForBulkOrderRequestByServiceCreate(Integer data) {
    if (data != null) {
      addInput("GlobalPkgParentAccountInternalId", data);
    }
  }
  public void setHierarchyIdForBulkOrderRequestByServiceCreate(Integer data) {
    if (data != null) {
      addInput("HierarchyId", data);
    }
  }
  public void setInvElementDefForBulkOrderRequestByServiceCreate(Integer data) {
    if (data != null) {
      addInput("InvElementDef", data);
    }
  }
  public void setInvElementFileNameForBulkOrderRequestByServiceCreate(String data) {
    if (data != null) {
      addInput("InvElementFileName", data);
    }
  }
  public void setInvSwapElementFileNameForBulkOrderRequestByServiceCreate(String data) {
    if (data != null) {
      addInput("InvSwapElementFileName", data);
    }
  }
  public void setServiceForBulkOrderRequestByServiceCreate(ServiceObjectBaseData data) {
    if (data != null) {
      addInput("Service", ServiceObjectBaseHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceQueryForBulkOrderRequestByServiceCreate(BulkParticipantQuery data) {
    if (data != null) {
      addInput("ServiceQuery", data);
    }
  }
  public void setTestParticipantCountForBulkOrderRequestByServiceCreate(Integer data) {
    if (data != null) {
      addInput("TestParticipantCount", data);
    }
  }
  public void setUDTTemplateForBulkOrderRequestByServiceCreate(BulkUdtTemplateRootRequest data) {
    if (data != null) {
      addInput("UDTTemplate", data);
    }
  }
  public void setXMLParticipantFileNameForBulkOrderRequestByServiceCreate(String data) {
    if (data != null) {
      addInput("XMLParticipantFileName", data);
    }
  }
  public void setBatchRequestForBulkOrderRequestByServiceGet(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setBatchRequestForBulkOrderRequestByServiceUpdate(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setCDFParticipantFileNameForBulkOrderRequestByServiceUpdate(String data) {
    if (data != null) {
      addInput("CDFParticipantFileName", data);
    }
  }
  public void setEquipExternalIdFileNameForBulkOrderRequestByServiceUpdate(String data) {
    if (data != null) {
      addInput("EquipExternalIdFileName", data);
    }
  }
  public void setGenerateWorkflowForBulkOrderRequestByServiceUpdate(Integer data) {
    if (data != null) {
      addInput("GenerateWorkflow", data);
    }
  }
  public void setGlobalPkgParentAccountInternalIdForBulkOrderRequestByServiceUpdate(Integer data) {
    if (data != null) {
      addInput("GlobalPkgParentAccountInternalId", data);
    }
  }
  public void setHierarchyIdForBulkOrderRequestByServiceUpdate(Integer data) {
    if (data != null) {
      addInput("HierarchyId", data);
    }
  }
  public void setInvElementDefForBulkOrderRequestByServiceUpdate(Integer data) {
    if (data != null) {
      addInput("InvElementDef", data);
    }
  }
  public void setInvElementFileNameForBulkOrderRequestByServiceUpdate(String data) {
    if (data != null) {
      addInput("InvElementFileName", data);
    }
  }
  public void setInvSwapElementFileNameForBulkOrderRequestByServiceUpdate(String data) {
    if (data != null) {
      addInput("InvSwapElementFileName", data);
    }
  }
  public void setServiceForBulkOrderRequestByServiceUpdate(ServiceObjectBaseData data) {
    if (data != null) {
      addInput("Service", ServiceObjectBaseHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceQueryForBulkOrderRequestByServiceUpdate(BulkParticipantQuery data) {
    if (data != null) {
      addInput("ServiceQuery", data);
    }
  }
  public void setTestParticipantCountForBulkOrderRequestByServiceUpdate(Integer data) {
    if (data != null) {
      addInput("TestParticipantCount", data);
    }
  }
  public void setUDTTemplateForBulkOrderRequestByServiceUpdate(BulkUdtTemplateRootRequest data) {
    if (data != null) {
      addInput("UDTTemplate", data);
    }
  }
  public void setXMLParticipantFileNameForBulkOrderRequestByServiceUpdate(String data) {
    if (data != null) {
      addInput("XMLParticipantFileName", data);
    }
  }
  public BatchRequestObjectData getBatchRequestObjectDataBulkOrderRequestFromBulkOrderRequestByAccountCreate() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BulkOrderRequest");
  }
  public BulkOrderRequestByAccountGetOutputData getBulkOrderRequestByAccountGetOutputDataBulkOrderRequestByAccountGetOutputDataFromBulkOrderRequestByAccountGet() {
    return BulkOrderRequestByAccountGetOutputHelper.fromMap(outputMap);
  }
  public BatchRequestObjectData getBatchRequestObjectDataBulkOrderRequestFromBulkOrderRequestByAccountUpdate() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BulkOrderRequest");
  }
  public BatchRequestObjectData getBatchRequestObjectDataBulkOrderRequestFromBulkOrderRequestByServiceCreate() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BulkOrderRequest");
  }
  public BulkOrderRequestByServiceGetOutputData getBulkOrderRequestByServiceGetOutputDataBulkOrderRequestByServiceGetOutputDataFromBulkOrderRequestByServiceGet() {
    return BulkOrderRequestByServiceGetOutputHelper.fromMap(outputMap);
  }
  public BatchRequestObjectData getBatchRequestObjectDataBulkOrderRequestFromBulkOrderRequestByServiceUpdate() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BulkOrderRequest");
  }
  /**
   @deprecated
   */
  public void setAccountObjectDataArray(AccountObjectData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = AccountObjectHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Account");
      }
      addInput("AccountList", list);
    }
  }
  /**
   @deprecated
   */
  public void setAccountQuery(BulkParticipantQuery data) {
    if (data != null) {
      addInput("AccountQuery", data);
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestObjectData(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap()).get("BatchRequestObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchRequestObjectData getBatchRequestObjectData() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BulkOrderRequest");
  }
  /**
   @deprecated
   */
  public BulkOrderRequestByAccountGetOutputData getBulkOrderRequestByAccountGetOutputData() {
    return BulkOrderRequestByAccountGetOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public BulkOrderRequestByServiceGetOutputData getBulkOrderRequestByServiceGetOutputData() {
    return BulkOrderRequestByServiceGetOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setCDFParticipantFileName(String data) {
    if (data != null) {
      addInput("CDFParticipantFileName", data);
    }
  }
  /**
   @deprecated
   */
  public void setEquipExternalIdFileName(String data) {
    if (data != null) {
      addInput("EquipExternalIdFileName", data);
    }
  }
  /**
   @deprecated
   */
  public void setGenerateWorkflow(Integer data) {
    if (data != null) {
      addInput("GenerateWorkflow", data);
    }
  }
  /**
   @deprecated
   */
  public void setGlobalPkgParentAccountInternalId(Integer data) {
    if (data != null) {
      addInput("GlobalPkgParentAccountInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setHierarchyId(Integer data) {
    if (data != null) {
      addInput("HierarchyId", data);
    }
  }
  /**
   @deprecated
   */
  public void setInvElementDef(Integer data) {
    if (data != null) {
      addInput("InvElementDef", data);
    }
  }
  /**
   @deprecated
   */
  public void setInvElementFileName(String data) {
    if (data != null) {
      addInput("InvElementFileName", data);
    }
  }
  /**
   @deprecated
   */
  public void setInvSwapElementFileName(String data) {
    if (data != null) {
      addInput("InvSwapElementFileName", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceObjectBaseDataArray(ServiceObjectBaseData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = ServiceObjectBaseHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Service");
      }
      addInput("ServiceList", list);
    }
  }
  /**
   @deprecated
   */
  public void setServiceQuery(BulkParticipantQuery data) {
    if (data != null) {
      addInput("ServiceQuery", data);
    }
  }
  /**
   @deprecated
   */
  public void setTestParticipantCount(Integer data) {
    if (data != null) {
      addInput("TestParticipantCount", data);
    }
  }
  /**
   @deprecated
   */
  public void setUDTTemplate(BulkUdtTemplateRootRequest data) {
    if (data != null) {
      addInput("UDTTemplate", data);
    }
  }
  /**
   @deprecated
   */
  public void setXMLParticipantFileName(String data) {
    if (data != null) {
      addInput("XMLParticipantFileName", data);
    }
  }
}
