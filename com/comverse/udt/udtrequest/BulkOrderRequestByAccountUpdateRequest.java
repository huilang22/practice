/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BulkOrderRequestByAccountUpdateRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BulkOrderRequestByAccountUpdateRequest Udt Request
 *
 */

public class BulkOrderRequestByAccountUpdateRequest extends BulkOrderRequestSubRequestParent {
/**
 *
 * Constructor to create a  BulkOrderRequestByAccountUpdateRequest
 * @param id Unique request name
 * @param _____BatchRequest BatchRequestObjectData for BulkOrderRequestByAccountUpdateRequest
 * @param ___Account AccountObjectData[] for BulkOrderRequestByAccountUpdateRequest
 * @param __HierarchyId Integer for BulkOrderRequestByAccountUpdateRequest
 * @param __InvElementDef Integer for BulkOrderRequestByAccountUpdateRequest
 * @param __InvSwapElementFileName String for BulkOrderRequestByAccountUpdateRequest
 * @param __EquipExternalIdFileName String for BulkOrderRequestByAccountUpdateRequest
 * @param __GlobalPkgParentAccountInternalId Integer for BulkOrderRequestByAccountUpdateRequest
 * @param __GenerateWorkflow Integer for BulkOrderRequestByAccountUpdateRequest
 * @param __UDTTemplate BulkUdtTemplateRootRequest for BulkOrderRequestByAccountUpdateRequest
 * @param __XMLParticipantFileName String for BulkOrderRequestByAccountUpdateRequest
 * @param __CDFParticipantFileName String for BulkOrderRequestByAccountUpdateRequest
 * @param __InvElementFileName String for BulkOrderRequestByAccountUpdateRequest
 * @param __TestParticipantCount Integer for BulkOrderRequestByAccountUpdateRequest
 * @param __AccountQuery BulkParticipantQuery for BulkOrderRequestByAccountUpdateRequest
 *
 */
@JsonCreator
  public BulkOrderRequestByAccountUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectData _____BatchRequest, @JsonProperty("Account")AccountObjectData[] ___Account, @JsonProperty("HierarchyId")Integer __HierarchyId, @JsonProperty("InvElementDef")Integer __InvElementDef, @JsonProperty("InvSwapElementFileName")String __InvSwapElementFileName, @JsonProperty("EquipExternalIdFileName")String __EquipExternalIdFileName, @JsonProperty("GlobalPkgParentAccountInternalId")Integer __GlobalPkgParentAccountInternalId, @JsonProperty("GenerateWorkflow")Integer __GenerateWorkflow, @JsonProperty("UDTTemplate")BulkUdtTemplateRootRequest __UDTTemplate, @JsonProperty("XMLParticipantFileName")String __XMLParticipantFileName, @JsonProperty("CDFParticipantFileName")String __CDFParticipantFileName, @JsonProperty("InvElementFileName")String __InvElementFileName, @JsonProperty("TestParticipantCount")Integer __TestParticipantCount, @JsonProperty("AccountQuery")BulkParticipantQuery __AccountQuery) {
    super(id, "BulkOrderRequestByAccountUpdate");
    if (_____BatchRequest != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(_____BatchRequest, new HashMap(), "BulkOrderRequest").get("BulkOrderRequest"));
    }
    if (___Account != null) {
      Object[] list = new Object[___Account.length];
      for (int i = 0; i < ___Account.length; i++) {
        list[i] = AccountObjectHelper.getMap(___Account[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Account");
      }
      addInput("AccountList", list);
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
 * Retrieves the BatchRequestObjectData that results from the BulkOrderRequestByAccountUpdateRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BulkOrderRequest");
  }
}
