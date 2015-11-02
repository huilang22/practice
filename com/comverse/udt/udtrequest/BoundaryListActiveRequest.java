/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BoundaryListActiveRequest.java
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
 * Class used to create a BoundaryListActiveRequest Udt Request
 *
 */

public class BoundaryListActiveRequest extends BoundaryRequest {
/**
 *
 * Constructor to create a  BoundaryListActiveRequest
 * @param id Unique request name
 * @param object_type_i Integer for BoundaryListActiveRequest
 * @param boundary_id_i Integer for BoundaryListActiveRequest
 *
 */
@JsonCreator
  public BoundaryListActiveRequest(@JsonProperty("RequestId") String id, @JsonProperty("ObjectTypeI")Integer object_type_i, @JsonProperty("BoundaryIdI")Integer boundary_id_i) {
    super(id, "BoundaryListActive");
    if (object_type_i != null) {
      addInput("ObjectTypeI", object_type_i);
    }
    if (boundary_id_i != null) {
      addInput("BoundaryIdI", boundary_id_i);
    }
  }

/**
 *
 * Retrieves the BoundaryObjectDataList that results from the BoundaryListActiveRequest call
 * @return BoundaryObjectDataList resulting from udt call
 *
 */

  public BoundaryObjectDataList getOutput() {
    return BoundaryObjectHelper.fromMapList(outputMap, "BoundaryList");
  }
}
