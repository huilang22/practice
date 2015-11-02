/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaInventoryAutoAssociateRequest.java
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

import com.csgsystems.iv.data.*;
import com.csgsystems.svbl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a GeoAreaInventoryAutoAssociateRequest Udt Request
 *
 */

public class GeoAreaInventoryAutoAssociateRequest extends InvAutoAssocSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaInventoryAutoAssociateRequest
 * @param id Unique request name
 * @param InvElementBulkIn InvElementObjData[] for GeoAreaInventoryAutoAssociateRequest
 * @param InventoryId Integer for GeoAreaInventoryAutoAssociateRequest
 * @param InventoryIdResets Integer for GeoAreaInventoryAutoAssociateRequest
 * @param ServiceNumberLo String for GeoAreaInventoryAutoAssociateRequest
 * @param ServiceNumberHi String for GeoAreaInventoryAutoAssociateRequest
 * @param BoundaryId Integer for GeoAreaInventoryAutoAssociateRequest
 * @param EnableAsync Integer for GeoAreaInventoryAutoAssociateRequest
 * @param Email String for GeoAreaInventoryAutoAssociateRequest
 *
 */
@JsonCreator
  public GeoAreaInventoryAutoAssociateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElementBulkIn")InvElementObjData[] InvElementBulkIn, @JsonProperty("InventoryId")Integer InventoryId, @JsonProperty("InventoryIdResets")Integer InventoryIdResets, @JsonProperty("ServiceNumberLo")String ServiceNumberLo, @JsonProperty("ServiceNumberHi")String ServiceNumberHi, @JsonProperty("BoundaryId")Integer BoundaryId, @JsonProperty("EnableAsync")Integer EnableAsync, @JsonProperty("Email")String Email) {
    super(id, "GeoAreaInventoryAutoAssociate");
    if (InvElementBulkIn != null) {
      Object[] list = new Object[InvElementBulkIn.length];
      for (int i = 0; i < InvElementBulkIn.length; i++) {
        list[i] = InvElementObjHelper.getMap(InvElementBulkIn[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "InvElementBulkIn");
      }
      addInput("InvElementBulkInList", list);
    }
    if (InventoryId != null) {
      addInput("InventoryId", InventoryId);
    }
    if (InventoryIdResets != null) {
      addInput("InventoryIdResets", InventoryIdResets);
    }
    if (ServiceNumberLo != null) {
      addInput("ServiceNumberLo", ServiceNumberLo);
    }
    if (ServiceNumberHi != null) {
      addInput("ServiceNumberHi", ServiceNumberHi);
    }
    if (BoundaryId != null) {
      addInput("BoundaryId", BoundaryId);
    }
    if (EnableAsync != null) {
      addInput("EnableAsync", EnableAsync);
    }
    if (Email != null) {
      addInput("Email", Email);
    }
  }

/**
 *
 * Retrieves the GeoAreaInventoryAutoAssociateOutputData that results from the GeoAreaInventoryAutoAssociateRequest call
 * @return GeoAreaInventoryAutoAssociateOutputData resulting from udt call
 *
 */

  public GeoAreaInventoryAutoAssociateOutputData getOutput() {
    return GeoAreaInventoryAutoAssociateOutputHelper.fromMap(outputMap);
  }
}
