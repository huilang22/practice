/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxPackageInstFindRequest.java
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
 * Class used to create a TaxPackageInstFindRequest Udt Request
 *
 */

public class TaxPackageInstFindRequest extends TaxPackageInstRequest {
/**
 *
 * Constructor to create a  TaxPackageInstFindRequest
 * @param id Unique request name
 * @param TPIFindIn TPIObjectFilter for TaxPackageInstFindRequest
 *
 */
@JsonCreator
  public TaxPackageInstFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("TaxPackageInst")TPIObjectFilter TPIFindIn) {
    super(id, "TaxPackageInstFind");
    if (TPIFindIn != null) {
      Integer index =  TPIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("TaxPackageInst", TPIObjectHelper.toMap(TPIFindIn, new HashMap(), "TaxPackageInst").get("TaxPackageInst"));
    }
  }

/**
 *
 * Retrieves the TPIObjectDataList that results from the TaxPackageInstFindRequest call
 * @return TPIObjectDataList resulting from udt call
 *
 */

  public TPIObjectDataList getOutput() {
    return TPIObjectHelper.fromMapList(outputMap, "TaxPackageInstList");
  }
}
