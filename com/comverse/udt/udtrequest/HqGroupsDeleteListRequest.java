/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupsDeleteListRequest.java
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
 * Class used to create a HqGroupsDeleteListRequest Udt Request
 *
 */

public class HqGroupsDeleteListRequest extends HqGroupsRequest {
/**
 *
 * Constructor to create a  HqGroupsDeleteListRequest
 * @param id Unique request name
 * @param hgxlFilter HqGroupsObjectFilter for HqGroupsDeleteListRequest
 * @param HGInactiveDate Date for HqGroupsDeleteListRequest
 *
 */
@JsonCreator
  public HqGroupsDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("HgxlFilter")HqGroupsObjectFilter hgxlFilter, @JsonProperty("HGInactiveDate")Date HGInactiveDate) {
    super(id, "HqGroupsDeleteList");
    if (hgxlFilter != null) {
      Integer index =  hgxlFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HgxlFilter", HqGroupsObjectHelper.toMap(hgxlFilter, new HashMap(), "Void").get("Void"));
    }
    if (HGInactiveDate != null) {
      addInput("HGInactiveDate", HGInactiveDate);
    }
  }

}
