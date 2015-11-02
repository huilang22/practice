/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupProductDeleteListRequest.java
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
 * Class used to create a HqGroupProductDeleteListRequest Udt Request
 *
 */

public class HqGroupProductDeleteListRequest extends HqGroupProductRequest {
/**
 *
 * Constructor to create a  HqGroupProductDeleteListRequest
 * @param id Unique request name
 * @param HQGPdeleteListIn HqGroupProductObjectFilter for HqGroupProductDeleteListRequest
 *
 */
@JsonCreator
  public HqGroupProductDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupProduct")HqGroupProductObjectFilter HQGPdeleteListIn) {
    super(id, "HqGroupProductDeleteList");
    if (HQGPdeleteListIn != null) {
      Integer index =  HQGPdeleteListIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(HQGPdeleteListIn, new HashMap(), "Void").get("Void"));
    }
  }

}
