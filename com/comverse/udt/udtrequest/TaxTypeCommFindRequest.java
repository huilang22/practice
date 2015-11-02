/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxTypeCommFindRequest.java
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
 * Class used to create a TaxTypeCommFindRequest Udt Request
 *
 */

public class TaxTypeCommFindRequest extends TaxTypeCommRequest {
/**
 *
 * Constructor to create a  TaxTypeCommFindRequest
 * @param id Unique request name
 * @param TTCFindIn TTCObjectFilter for TaxTypeCommFindRequest
 *
 */
@JsonCreator
  public TaxTypeCommFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("TaxTypeComm")TTCObjectFilter TTCFindIn) {
    super(id, "TaxTypeCommFind");
    if (TTCFindIn != null) {
      Integer index =  TTCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("TaxTypeComm", TTCObjectHelper.toMap(TTCFindIn, new HashMap(), "TaxTypeComm").get("TaxTypeComm"));
    }
  }

/**
 *
 * Retrieves the TTCObjectDataList that results from the TaxTypeCommFindRequest call
 * @return TTCObjectDataList resulting from udt call
 *
 */

  public TTCObjectDataList getOutput() {
    return TTCObjectHelper.fromMapList(outputMap, "TaxTypeCommList");
  }
}
