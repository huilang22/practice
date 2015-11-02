/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageGroupFindRequest.java
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
 * Class used to create a PackageGroupFindRequest Udt Request
 *
 */

public class PackageGroupFindRequest extends PackageGroupRequest {
/**
 *
 * Constructor to create a  PackageGroupFindRequest
 * @param id Unique request name
 * @param PGFindIn PGObjectFilter for PackageGroupFindRequest
 *
 */
@JsonCreator
  public PackageGroupFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageGroup")PGObjectFilter PGFindIn) {
    super(id, "PackageGroupFind");
    if (PGFindIn != null) {
      Integer index =  PGFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PackageGroup", PGObjectHelper.toMap(PGFindIn, new HashMap(), "PackageGroup").get("PackageGroup"));
    }
  }

/**
 *
 * Retrieves the PGObjectDataList that results from the PackageGroupFindRequest call
 * @return PGObjectDataList resulting from udt call
 *
 */

  public PGObjectDataList getOutput() {
    return PGObjectHelper.fromMapList(outputMap, "PackageGroupList");
  }
}
