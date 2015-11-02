/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcCmfPackageFindRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a SvcCmfPackageFindRequest Udt Request
 *
 */

public class SvcCmfPackageFindRequest extends SvcCmfPackageRequest {
/**
 *
 * Constructor to create a  SvcCmfPackageFindRequest
 * @param id Unique request name
 * @param SvcCmfPackageFindIn SvcCmfPackageObjectFilter for SvcCmfPackageFindRequest
 *
 */
@JsonCreator
  public SvcCmfPackageFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("SvcCmfPackage")SvcCmfPackageObjectFilter SvcCmfPackageFindIn) {
    super(id, "SvcCmfPackageFind");
    if (SvcCmfPackageFindIn != null) {
      Integer index =  SvcCmfPackageFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SvcCmfPackage", SvcCmfPackageObjectHelper.toMap(SvcCmfPackageFindIn, new HashMap(), "SvcCmfPackage").get("SvcCmfPackage"));
    }
  }

/**
 *
 * Retrieves the SvcCmfPackageObjectDataList that results from the SvcCmfPackageFindRequest call
 * @return SvcCmfPackageObjectDataList resulting from udt call
 *
 */

  public SvcCmfPackageObjectDataList getOutput() {
    return SvcCmfPackageObjectHelper.fromMapList(outputMap, "SvcCmfPackageList");
  }
}
