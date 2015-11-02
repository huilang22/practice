/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BulkOrderRequestByServiceCreateRequest.java
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
 * Class used to create a BulkOrderRequestByServiceCreateRequest Udt Request
 *
 */

public class BulkOrderRequestByServiceCreateRequest extends BulkOrderRequestSubRequestParent {
/**
 *
 * Constructor to create a  BulkOrderRequestByServiceCreateRequest
 * @param id Unique request name
 * @param _______BatchRequest BatchRequestObjectData for BulkOrderRequestByServiceCreateRequest
 * @param _Service ServiceObjectBaseData[] for BulkOrderRequestByServiceCreateRequest
 * @param ___HierarchyId Integer for BulkOrderRequestByServiceCreateRequest
 * @param ___InvElementDef Integer for BulkOrderRequestByServiceCreateRequest
 * @param ___InvSwapElementFileName String for BulkOrderRequestByServiceCreateRequest
 * @param ___EquipExternalIdFileName String for BulkOrderRequestByServiceCreateRequest
 * @param ___GlobalPkgParentAccountInternalId Integer for BulkOrderRequestByServiceCreateRequest
 * @param ___GenerateWorkflow Integer for BulkOrderRequestByServiceCreateRequest
 * @param ___UDTTemplate BulkUdtTemplateRootRequest for BulkOrderRequestByServiceCreateRequest
 * @param ___XMLParticipantFileName String for BulkOrderRequestByServiceCreateRequest
 * @param ___CDFParticipantFileName String for BulkOrderRequestByServiceCreateRequest
 * @param ___InvElementFileName String for BulkOrderRequestByServiceCreateRequest
 * @param ___TestParticipantCount Integer for BulkOrderRequestByServiceCreateRequest
 * @param ServiceQuery BulkParticipantQuery for BulkOrderRequestByServiceCreateRequest
 *
 */
@JsonCreator
  public BulkOrderRequestByServiceCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectData _______BatchRequest, @JsonProperty("Service")ServiceObjectBaseData[] _Service, @JsonProperty("HierarchyId")Integer ___HierarchyId, @JsonProperty("InvElementDef")Integer ___InvElementDef, @JsonProperty("InvSwapElementFileName")String ___InvSwapElementFileName, @JsonProperty("EquipExternalIdFileName")String ___EquipExternalIdFileName, @JsonProperty("GlobalPkgParentAccountInternalId")Integer ___GlobalPkgParentAccountInternalId, @JsonProperty("GenerateWorkflow")Integer ___GenerateWorkflow, @JsonProperty("UDTTemplate")BulkUdtTemplateRootRequest ___UDTTemplate, @JsonProperty("XMLParticipantFileName")String ___XMLParticipantFileName, @JsonProperty("CDFParticipantFileName")String ___CDFParticipantFileName, @JsonProperty("InvElementFileName")String ___InvElementFileName, @JsonProperty("TestParticipantCount")Integer ___TestParticipantCount, @JsonProperty("ServiceQuery")BulkParticipantQuery ServiceQuery) {
    super(id, "BulkOrderRequestByServiceCreate");
    if (_______BatchRequest != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(_______BatchRequest, new HashMap(), "BulkOrderRequest").get("BulkOrderRequest"));
    }
    if (_Service != null) {
      Object[] list = new Object[_Service.length];
      for (int i = 0; i < _Service.length; i++) {
        list[i] = ServiceObjectBaseHelper.getMap(_Service[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Service");
      }
      addInput("ServiceList", list);
    }
    if (___HierarchyId != null) {
      addInput("HierarchyId", ___HierarchyId);
    }
    if (___InvElementDef != null) {
      addInput("InvElementDef", ___InvElementDef);
    }
    if (___InvSwapElementFileName != null) {
      addInput("InvSwapElementFileName", ___InvSwapElementFileName);
    }
    if (___EquipExternalIdFileName != null) {
      addInput("EquipExternalIdFileName", ___EquipExternalIdFileName);
    }
    if (___GlobalPkgParentAccountInternalId != null) {
      addInput("GlobalPkgParentAccountInternalId", ___GlobalPkgParentAccountInternalId);
    }
    if (___GenerateWorkflow != null) {
      addInput("GenerateWorkflow", ___GenerateWorkflow);
    }
    if (___UDTTemplate != null) {
      addInput("UDTTemplate", ___UDTTemplate);
    }
    if (___XMLParticipantFileName != null) {
      addInput("XMLParticipantFileName", ___XMLParticipantFileName);
    }
    if (___CDFParticipantFileName != null) {
      addInput("CDFParticipantFileName", ___CDFParticipantFileName);
    }
    if (___InvElementFileName != null) {
      addInput("InvElementFileName", ___InvElementFileName);
    }
    if (___TestParticipantCount != null) {
      addInput("TestParticipantCount", ___TestParticipantCount);
    }
    if (ServiceQuery != null) {
      addInput("ServiceQuery", ServiceQuery);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the BulkOrderRequestByServiceCreateRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BulkOrderRequest");
  }
}
