/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentDefFindByAccountRequest.java
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
 * Class used to create a PackageComponentDefFindByAccountRequest Udt Request
 *
 */

public class PackageComponentDefFindByAccountRequest extends PackageComponentDefRequest {
/**
 *
 * Constructor to create a  PackageComponentDefFindByAccountRequest
 * @param id Unique request name
 * @param language_code Integer for PackageComponentDefFindByAccountRequest
 * @param account_internal_id Integer for PackageComponentDefFindByAccountRequest
 *
 */
@JsonCreator
  public PackageComponentDefFindByAccountRequest(@JsonProperty("RequestId") String id, @JsonProperty("LanguageCode")Integer language_code, @JsonProperty("AccountInternalId")Integer account_internal_id) {
    super(id, "PackageComponentDefFindByAccount");
    if (language_code != null) {
      addInput("LanguageCode", language_code);
    }
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
  }

/**
 *
 * Retrieves the PCDObjectDataList that results from the PackageComponentDefFindByAccountRequest call
 * @return PCDObjectDataList resulting from udt call
 *
 */

  public PCDObjectDataList getOutput() {
    return PCDObjectHelper.fromMapList(outputMap, "PackageComponentDefList");
  }
}
