/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageDefinitionFindRequest.java
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
 * Class used to create a PackageDefinitionFindRequest Udt Request
 *
 */

public class PackageDefinitionFindRequest extends PackageDefinitionRequest {
/**
 *
 * Constructor to create a  PackageDefinitionFindRequest
 * @param id Unique request name
 * @param PDFindIn PDObjectFilter for PackageDefinitionFindRequest
 *
 */
@JsonCreator
  public PackageDefinitionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageDefinition")PDObjectFilter PDFindIn) {
    super(id, "PackageDefinitionFind");
    if (PDFindIn != null) {
      Integer index =  PDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PackageDefinition", PDObjectHelper.toMap(PDFindIn, new HashMap(), "PackageDefinition").get("PackageDefinition"));
    }
  }

/**
 *
 * Retrieves the PDObjectDataList that results from the PackageDefinitionFindRequest call
 * @return PDObjectDataList resulting from udt call
 *
 */

  public PDObjectDataList getOutput() {
    return PDObjectHelper.fromMapList(outputMap, "PackageDefinitionList");
  }
}
