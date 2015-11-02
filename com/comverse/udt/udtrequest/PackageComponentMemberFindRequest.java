/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentMemberFindRequest.java
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
 * Class used to create a PackageComponentMemberFindRequest Udt Request
 *
 */

public class PackageComponentMemberFindRequest extends PackageComponentMemberRequest {
/**
 *
 * Constructor to create a  PackageComponentMemberFindRequest
 * @param id Unique request name
 * @param PCMFindIn PCMObjectFilter for PackageComponentMemberFindRequest
 *
 */
@JsonCreator
  public PackageComponentMemberFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageComponentMember")PCMObjectFilter PCMFindIn) {
    super(id, "PackageComponentMemberFind");
    if (PCMFindIn != null) {
      Integer index =  PCMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PackageComponentMember", PCMObjectHelper.toMap(PCMFindIn, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
  }

/**
 *
 * Retrieves the PCMObjectDataList that results from the PackageComponentMemberFindRequest call
 * @return PCMObjectDataList resulting from udt call
 *
 */

  public PCMObjectDataList getOutput() {
    return PCMObjectHelper.fromMapList(outputMap, "PackageComponentMemberList");
  }
}
