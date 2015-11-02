/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentMemberFindPCRequest.java
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
 * Class used to create a PackageComponentMemberFindPCRequest Udt Request
 *
 */

public class PackageComponentMemberFindPCRequest extends PackageComponentMemberRequest {
/**
 *
 * Constructor to create a  PackageComponentMemberFindPCRequest
 * @param id Unique request name
 * @param PCPCMFindIn PCPCMObjectFilter for PackageComponentMemberFindPCRequest
 *
 */
@JsonCreator
  public PackageComponentMemberFindPCRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageComponentMember")PCPCMObjectFilter PCPCMFindIn) {
    super(id, "PackageComponentMemberFindPC");
    if (PCPCMFindIn != null) {
      Integer index =  PCPCMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PackageComponentMember", PCPCMObjectHelper.toMap(PCPCMFindIn, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
  }

/**
 *
 * Retrieves the PCPCMObjectDataList that results from the PackageComponentMemberFindPCRequest call
 * @return PCPCMObjectDataList resulting from udt call
 *
 */

  public PCPCMObjectDataList getOutput() {
    return PCPCMObjectHelper.fromMapList(outputMap, "PackageComponentMemberList");
  }
}
