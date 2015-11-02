/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageDefinitionFindByAccountRequest.java
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
 * Class used to create a PackageDefinitionFindByAccountRequest Udt Request
 *
 */

public class PackageDefinitionFindByAccountRequest extends PackageDefinitionRequest {
/**
 *
 * Constructor to create a  PackageDefinitionFindByAccountRequest
 * @param id Unique request name
 * @param account_internal_id Integer for PackageDefinitionFindByAccountRequest
 * @param language_code Integer for PackageDefinitionFindByAccountRequest
 *
 */
@JsonCreator
  public PackageDefinitionFindByAccountRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInternalId")Integer account_internal_id, @JsonProperty("LanguageCode")Integer language_code) {
    super(id, "PackageDefinitionFindByAccount");
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
    if (language_code != null) {
      addInput("LanguageCode", language_code);
    }
  }

/**
 *
 * Retrieves the PDObjectDataList that results from the PackageDefinitionFindByAccountRequest call
 * @return PDObjectDataList resulting from udt call
 *
 */

  public PDObjectDataList getOutput() {
    return PDObjectHelper.fromMapList(outputMap, "PackageDefinitionList");
  }
}
