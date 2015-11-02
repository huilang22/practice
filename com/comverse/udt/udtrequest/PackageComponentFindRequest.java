/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PackageComponentFindRequest Udt Request
 *
 */

public class PackageComponentFindRequest extends PackageComponentRequest {
/**
 *
 * Constructor to create a  PackageComponentFindRequest
 * @param id Unique request name
 * @param PCFindIn PCObjectFilter for PackageComponentFindRequest
 *
 */
@JsonCreator
  public PackageComponentFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageComponent")PCObjectFilter PCFindIn) {
    super(id, "PackageComponentFind");
    if (PCFindIn != null) {
      Integer index =  PCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PackageComponent", PCObjectHelper.toMap(PCFindIn, new HashMap(), "PackageComponent").get("PackageComponent"));
    }
  }

/**
 *
 * Retrieves the PCObjectDataList that results from the PackageComponentFindRequest call
 * @return PCObjectDataList resulting from udt call
 *
 */

  public PCObjectDataList getOutput() {
    return PCObjectHelper.fromMapList(outputMap, "PackageComponentList");
  }
}
