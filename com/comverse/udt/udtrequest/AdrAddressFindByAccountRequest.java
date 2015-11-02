/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressFindByAccountRequest.java
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
 * Class used to create a AdrAddressFindByAccountRequest Udt Request
 *
 */

public class AdrAddressFindByAccountRequest extends AdrAddressRequest {
/**
 *
 * Constructor to create a  AdrAddressFindByAccountRequest
 * @param id Unique request name
 * @param account_internal_id Integer for AdrAddressFindByAccountRequest
 *
 */
@JsonCreator
  public AdrAddressFindByAccountRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInternalId")Integer account_internal_id) {
    super(id, "AdrAddressFindByAccount");
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
  }

/**
 *
 * Retrieves the AdrAddressObjectDataList that results from the AdrAddressFindByAccountRequest call
 * @return AdrAddressObjectDataList resulting from udt call
 *
 */

  public AdrAddressObjectDataList getOutput() {
    return AdrAddressObjectHelper.fromMapList(outputMap, "AdrAddressList");
  }
}
