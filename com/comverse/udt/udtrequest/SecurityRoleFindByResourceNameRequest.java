/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityRoleFindByResourceNameRequest.java
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
 * Class used to create a SecurityRoleFindByResourceNameRequest Udt Request
 *
 */

public class SecurityRoleFindByResourceNameRequest extends SecurityRoleRequest {
/**
 *
 * Constructor to create a  SecurityRoleFindByResourceNameRequest
 * @param id Unique request name
 * @param res_name String for SecurityRoleFindByResourceNameRequest
 * @param language_code Integer for SecurityRoleFindByResourceNameRequest
 *
 */
@JsonCreator
  public SecurityRoleFindByResourceNameRequest(@JsonProperty("RequestId") String id, @JsonProperty("ResName")String res_name, @JsonProperty("LanguageCode")Integer language_code) {
    super(id, "SecurityRoleFindByResourceName");
    if (res_name != null) {
      addInput("ResName", res_name);
    }
    if (language_code != null) {
      addInput("LanguageCode", language_code);
    }
  }

/**
 *
 * Retrieves the SecurityRoleObjectDataList that results from the SecurityRoleFindByResourceNameRequest call
 * @return SecurityRoleObjectDataList resulting from udt call
 *
 */

  public SecurityRoleObjectDataList getOutput() {
    return SecurityRoleObjectHelper.fromMapList(outputMap, "SecurityRoleList");
  }
}
