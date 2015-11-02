/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaInventoryAssocResetAutoRequest.java
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

import com.csgsystems.svbl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a GeoAreaInventoryAssocResetAutoRequest Udt Request
 *
 */

public class GeoAreaInventoryAssocResetAutoRequest extends GeoAreaInventoryAssocRequest {
/**
 *
 * Constructor to create a  GeoAreaInventoryAssocResetAutoRequest
 * @param id Unique request name
 * @param inventory_id Integer for GeoAreaInventoryAssocResetAutoRequest
 * @param inventory_id_resets Integer for GeoAreaInventoryAssocResetAutoRequest
 *
 */
@JsonCreator
  public GeoAreaInventoryAssocResetAutoRequest(@JsonProperty("RequestId") String id, @JsonProperty("InventoryId")Integer inventory_id, @JsonProperty("InventoryIdResets")Integer inventory_id_resets) {
    super(id, "GeoAreaInventoryAssocResetAuto");
    if (inventory_id != null) {
      addInput("InventoryId", inventory_id);
    }
    if (inventory_id_resets != null) {
      addInput("InventoryIdResets", inventory_id_resets);
    }
  }

}
