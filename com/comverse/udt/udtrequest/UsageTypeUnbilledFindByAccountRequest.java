/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeUnbilledFindByAccountRequest.java
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
 * Class used to create a UsageTypeUnbilledFindByAccountRequest Udt Request
 *
 */

public class UsageTypeUnbilledFindByAccountRequest extends UsageTypeRequest {
/**
 *
 * Constructor to create a  UsageTypeUnbilledFindByAccountRequest
 * @param id Unique request name
 * @param Language_code Integer for UsageTypeUnbilledFindByAccountRequest
 * @param account_no Integer for UsageTypeUnbilledFindByAccountRequest
 *
 */
@JsonCreator
  public UsageTypeUnbilledFindByAccountRequest(@JsonProperty("RequestId") String id, @JsonProperty("LanguageCode")Integer Language_code, @JsonProperty("AccountInternalId")Integer account_no) {
    super(id, "UsageTypeUnbilledFindByAccount");
    if (Language_code != null) {
      addInput("LanguageCode", Language_code);
    }
    if (account_no != null) {
      addInput("AccountInternalId", account_no);
    }
  }

/**
 *
 * Retrieves the UsageTypeObjectDataList that results from the UsageTypeUnbilledFindByAccountRequest call
 * @return UsageTypeObjectDataList resulting from udt call
 *
 */

  public UsageTypeObjectDataList getOutput() {
    return UsageTypeObjectHelper.fromMapList(outputMap, "UsageTypeList");
  }
}
