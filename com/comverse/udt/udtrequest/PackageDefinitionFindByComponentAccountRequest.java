/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageDefinitionFindByComponentAccountRequest.java
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
 * Class used to create a PackageDefinitionFindByComponentAccountRequest Udt Request
 *
 */

public class PackageDefinitionFindByComponentAccountRequest extends PackageDefinitionRequest {
/**
 *
 * Constructor to create a  PackageDefinitionFindByComponentAccountRequest
 * @param id Unique request name
 * @param _account_internal_id Integer for PackageDefinitionFindByComponentAccountRequest
 * @param _language_code Integer for PackageDefinitionFindByComponentAccountRequest
 *
 */
@JsonCreator
  public PackageDefinitionFindByComponentAccountRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInternalId")Integer _account_internal_id, @JsonProperty("LanguageCode")Integer _language_code) {
    super(id, "PackageDefinitionFindByComponentAccount");
    if (_account_internal_id != null) {
      addInput("AccountInternalId", _account_internal_id);
    }
    if (_language_code != null) {
      addInput("LanguageCode", _language_code);
    }
  }

/**
 *
 * Retrieves the PDObjectDataList that results from the PackageDefinitionFindByComponentAccountRequest call
 * @return PDObjectDataList resulting from udt call
 *
 */

  public PDObjectDataList getOutput() {
    return PDObjectHelper.fromMapList(outputMap, "PackageDefinitionList");
  }
}
