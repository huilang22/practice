/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemIdMapDeleteListRequest.java
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
 * Class used to create a OpenItemIdMapDeleteListRequest Udt Request
 *
 */

public class OpenItemIdMapDeleteListRequest extends OpenItemIdMapRequest {
/**
 *
 * Constructor to create a  OpenItemIdMapDeleteListRequest
 * @param id Unique request name
 * @param OpenItemIdMapFilter OpenItemIdMapObjectFilter for OpenItemIdMapDeleteListRequest
 * @param OIIMDLCeaseDate Date for OpenItemIdMapDeleteListRequest
 *
 */
@JsonCreator
  public OpenItemIdMapDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("OpenItemIdMapFilter")OpenItemIdMapObjectFilter OpenItemIdMapFilter, @JsonProperty("InactiveDate")Date OIIMDLCeaseDate) {
    super(id, "OpenItemIdMapDeleteList");
    if (OpenItemIdMapFilter != null) {
      Integer index =  OpenItemIdMapFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OpenItemIdMapFilter", OpenItemIdMapObjectHelper.toMap(OpenItemIdMapFilter, new HashMap(), "Void").get("Void"));
    }
    if (OIIMDLCeaseDate != null) {
      addInput("InactiveDate", OIIMDLCeaseDate);
    }
  }

}
