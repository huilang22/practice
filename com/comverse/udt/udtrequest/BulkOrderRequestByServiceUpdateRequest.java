/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BulkOrderRequestByServiceUpdateRequest.java
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
 * Class used to create a BulkOrderRequestByServiceUpdateRequest Udt Request
 *
 */

public class BulkOrderRequestByServiceUpdateRequest extends BulkOrderRequestSubRequestParent {
/**
 *
 * Constructor to create a  BulkOrderRequestByServiceUpdateRequest
 * @param id Unique request name
 * @param ___________BatchRequest BatchRequestObjectData for BulkOrderRequestByServiceUpdateRequest
 * @param ______Service ServiceObjectBaseData[] for BulkOrderRequestByServiceUpdateRequest
 * @param _____HierarchyId Integer for BulkOrderRequestByServiceUpdateRequest
 * @param _____InvElementDef Integer for BulkOrderRequestByServiceUpdateRequest
 * @param _____InvSwapElementFileName String for BulkOrderRequestByServiceUpdateRequest
 * @param _____EquipExternalIdFileName String for BulkOrderRequestByServiceUpdateRequest
 * @param _____GlobalPkgParentAccountInternalId Integer for BulkOrderRequestByServiceUpdateRequest
 * @param _____GenerateWorkflow Integer for BulkOrderRequestByServiceUpdateRequest
 * @param _____UDTTemplate BulkUdtTemplateRootRequest for BulkOrderRequestByServiceUpdateRequest
 * @param _____XMLParticipantFileName String for BulkOrderRequestByServiceUpdateRequest
 * @param _____CDFParticipantFileName String for BulkOrderRequestByServiceUpdateRequest
 * @param _____InvElementFileName String for BulkOrderRequestByServiceUpdateRequest
 * @param _____TestParticipantCount Integer for BulkOrderRequestByServiceUpdateRequest
 * @param __ServiceQuery BulkParticipantQuery for BulkOrderRequestByServiceUpdateRequest
 *
 */
@JsonCreator
  public BulkOrderRequestByServiceUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectData ___________BatchRequest, @JsonProperty("Service")ServiceObjectBaseData[] ______Service, @JsonProperty("HierarchyId")Integer _____HierarchyId, @JsonProperty("InvElementDef")Integer _____InvElementDef, @JsonProperty("InvSwapElementFileName")String _____InvSwapElementFileName, @JsonProperty("EquipExternalIdFileName")String _____EquipExternalIdFileName, @JsonProperty("GlobalPkgParentAccountInternalId")Integer _____GlobalPkgParentAccountInternalId, @JsonProperty("GenerateWorkflow")Integer _____GenerateWorkflow, @JsonProperty("UDTTemplate")BulkUdtTemplateRootRequest _____UDTTemplate, @JsonProperty("XMLParticipantFileName")String _____XMLParticipantFileName, @JsonProperty("CDFParticipantFileName")String _____CDFParticipantFileName, @JsonProperty("InvElementFileName")String _____InvElementFileName, @JsonProperty("TestParticipantCount")Integer _____TestParticipantCount, @JsonProperty("ServiceQuery")BulkParticipantQuery __ServiceQuery) {
    super(id, "BulkOrderRequestByServiceUpdate");
    if (___________BatchRequest != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(___________BatchRequest, new HashMap(), "BulkOrderRequest").get("BulkOrderRequest"));
    }
    if (______Service != null) {
      Object[] list = new Object[______Service.length];
      for (int i = 0; i < ______Service.length; i++) {
        list[i] = ServiceObjectBaseHelper.getMap(______Service[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Service");
      }
      addInput("ServiceList", list);
    }
    if (_____HierarchyId != null) {
      addInput("HierarchyId", _____HierarchyId);
    }
    if (_____InvElementDef != null) {
      addInput("InvElementDef", _____InvElementDef);
    }
    if (_____InvSwapElementFileName != null) {
      addInput("InvSwapElementFileName", _____InvSwapElementFileName);
    }
    if (_____EquipExternalIdFileName != null) {
      addInput("EquipExternalIdFileName", _____EquipExternalIdFileName);
    }
    if (_____GlobalPkgParentAccountInternalId != null) {
      addInput("GlobalPkgParentAccountInternalId", _____GlobalPkgParentAccountInternalId);
    }
    if (_____GenerateWorkflow != null) {
      addInput("GenerateWorkflow", _____GenerateWorkflow);
    }
    if (_____UDTTemplate != null) {
      addInput("UDTTemplate", _____UDTTemplate);
    }
    if (_____XMLParticipantFileName != null) {
      addInput("XMLParticipantFileName", _____XMLParticipantFileName);
    }
    if (_____CDFParticipantFileName != null) {
      addInput("CDFParticipantFileName", _____CDFParticipantFileName);
    }
    if (_____InvElementFileName != null) {
      addInput("InvElementFileName", _____InvElementFileName);
    }
    if (_____TestParticipantCount != null) {
      addInput("TestParticipantCount", _____TestParticipantCount);
    }
    if (__ServiceQuery != null) {
      addInput("ServiceQuery", __ServiceQuery);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the BulkOrderRequestByServiceUpdateRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BulkOrderRequest");
  }
}
