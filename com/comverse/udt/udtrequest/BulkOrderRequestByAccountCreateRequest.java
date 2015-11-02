/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BulkOrderRequestByAccountCreateRequest.java
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
 * Class used to create a BulkOrderRequestByAccountCreateRequest Udt Request
 *
 */

public class BulkOrderRequestByAccountCreateRequest extends BulkOrderRequestSubRequestParent {
/**
 *
 * Constructor to create a  BulkOrderRequestByAccountCreateRequest
 * @param id Unique request name
 * @param _BatchRequest BatchRequestObjectData for BulkOrderRequestByAccountCreateRequest
 * @param _Account AccountObjectData[] for BulkOrderRequestByAccountCreateRequest
 * @param UDTTemplate BulkUdtTemplateRootRequest for BulkOrderRequestByAccountCreateRequest
 * @param XMLParticipantFileName String for BulkOrderRequestByAccountCreateRequest
 * @param CDFParticipantFileName String for BulkOrderRequestByAccountCreateRequest
 * @param AccountQuery BulkParticipantQuery for BulkOrderRequestByAccountCreateRequest
 * @param HierarchyId Integer for BulkOrderRequestByAccountCreateRequest
 * @param InvElementDef Integer for BulkOrderRequestByAccountCreateRequest
 * @param InvSwapElementFileName String for BulkOrderRequestByAccountCreateRequest
 * @param EquipExternalIdFileName String for BulkOrderRequestByAccountCreateRequest
 * @param GlobalPkgParentAccountInternalId Integer for BulkOrderRequestByAccountCreateRequest
 * @param GenerateWorkflow Integer for BulkOrderRequestByAccountCreateRequest
 * @param TestParticipantCount Integer for BulkOrderRequestByAccountCreateRequest
 * @param InvElementFileName String for BulkOrderRequestByAccountCreateRequest
 *
 */
@JsonCreator
  public BulkOrderRequestByAccountCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectData _BatchRequest, @JsonProperty("Account")AccountObjectData[] _Account, @JsonProperty("UDTTemplate")BulkUdtTemplateRootRequest UDTTemplate, @JsonProperty("XMLParticipantFileName")String XMLParticipantFileName, @JsonProperty("CDFParticipantFileName")String CDFParticipantFileName, @JsonProperty("AccountQuery")BulkParticipantQuery AccountQuery, @JsonProperty("HierarchyId")Integer HierarchyId, @JsonProperty("InvElementDef")Integer InvElementDef, @JsonProperty("InvSwapElementFileName")String InvSwapElementFileName, @JsonProperty("EquipExternalIdFileName")String EquipExternalIdFileName, @JsonProperty("GlobalPkgParentAccountInternalId")Integer GlobalPkgParentAccountInternalId, @JsonProperty("GenerateWorkflow")Integer GenerateWorkflow, @JsonProperty("TestParticipantCount")Integer TestParticipantCount, @JsonProperty("InvElementFileName")String InvElementFileName) {
    super(id, "BulkOrderRequestByAccountCreate");
    if (_BatchRequest != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(_BatchRequest, new HashMap(), "BulkOrderRequest").get("BulkOrderRequest"));
    }
    if (_Account != null) {
      Object[] list = new Object[_Account.length];
      for (int i = 0; i < _Account.length; i++) {
        list[i] = AccountObjectHelper.getMap(_Account[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Account");
      }
      addInput("AccountList", list);
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
 * Retrieves the BatchRequestObjectData that results from the BulkOrderRequestByAccountCreateRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BulkOrderRequest");
  }
}
