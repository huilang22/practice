/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigAddressCategoryMapFindRequest.java
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
 * Class used to create a EmfConfigAddressCategoryMapFindRequest Udt Request
 *
 */

public class EmfConfigAddressCategoryMapFindRequest extends EmfConfigAddressCategoryMapRequest {
/**
 *
 * Constructor to create a  EmfConfigAddressCategoryMapFindRequest
 * @param id Unique request name
 * @param ECACMFindIn EmfConfigAddressCategoryMapObjectFilter for EmfConfigAddressCategoryMapFindRequest
 *
 */
@JsonCreator
  public EmfConfigAddressCategoryMapFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("EmfConfigAddressCategoryMap")EmfConfigAddressCategoryMapObjectFilter ECACMFindIn) {
    super(id, "EmfConfigAddressCategoryMapFind");
    if (ECACMFindIn != null) {
      Integer index =  ECACMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EmfConfigAddressCategoryMap", EmfConfigAddressCategoryMapObjectHelper.toMap(ECACMFindIn, new HashMap(), "EmfConfigAddressCategoryMap").get("EmfConfigAddressCategoryMap"));
    }
  }

/**
 *
 * Retrieves the EmfConfigAddressCategoryMapObjectDataList that results from the EmfConfigAddressCategoryMapFindRequest call
 * @return EmfConfigAddressCategoryMapObjectDataList resulting from udt call
 *
 */

  public EmfConfigAddressCategoryMapObjectDataList getOutput() {
    return EmfConfigAddressCategoryMapObjectHelper.fromMapList(outputMap, "EmfConfigAddressCategoryMapList");
  }
}
