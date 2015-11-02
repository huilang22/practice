/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrFindByAccountRequest.java
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
 * Class used to create a NrcTransDescrFindByAccountRequest Udt Request
 *
 */

public class NrcTransDescrFindByAccountRequest extends NrcTransDescrRequest {
/**
 *
 * Constructor to create a  NrcTransDescrFindByAccountRequest
 * @param id Unique request name
 * @param language_code Integer for NrcTransDescrFindByAccountRequest
 * @param account_internal_id Integer for NrcTransDescrFindByAccountRequest
 *
 */
@JsonCreator
  public NrcTransDescrFindByAccountRequest(@JsonProperty("RequestId") String id, @JsonProperty("LanguageCode")Integer language_code, @JsonProperty("AccountInternalId")Integer account_internal_id) {
    super(id, "NrcTransDescrFindByAccount");
    if (language_code != null) {
      addInput("LanguageCode", language_code);
    }
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
  }

/**
 *
 * Retrieves the NrcTransDescrObjectDataList that results from the NrcTransDescrFindByAccountRequest call
 * @return NrcTransDescrObjectDataList resulting from udt call
 *
 */

  public NrcTransDescrObjectDataList getOutput() {
    return NrcTransDescrObjectHelper.fromMapList(outputMap, "NrcTransDescrList");
  }
}
