/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentDefFindRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PackageComponentDefFindRequest Udt Request
 *
 */

public class PackageComponentDefFindRequest extends PackageComponentDefRequest {
/**
 *
 * Constructor to create a  PackageComponentDefFindRequest
 * @param id Unique request name
 * @param PCDFindIn PCDObjectFilter for PackageComponentDefFindRequest
 *
 */
@JsonCreator
  public PackageComponentDefFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageComponentDef")PCDObjectFilter PCDFindIn) {
    super(id, "PackageComponentDefFind");
    if (PCDFindIn != null) {
      Integer index =  PCDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PackageComponentDef", PCDObjectHelper.toMap(PCDFindIn, new HashMap(), "PackageComponentDef").get("PackageComponentDef"));
    }
  }

/**
 *
 * Retrieves the PCDObjectDataList that results from the PackageComponentDefFindRequest call
 * @return PCDObjectDataList resulting from udt call
 *
 */

  public PCDObjectDataList getOutput() {
    return PCDObjectHelper.fromMapList(outputMap, "PackageComponentDefList");
  }
}
