/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFeedFileFindRequest.java
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

import com.csgsystems.ctc.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtcFeedFileFindRequest Udt Request
 *
 */

public class CtcFeedFileFindRequest extends CtcFeedFileRequest {
/**
 *
 * Constructor to create a  CtcFeedFileFindRequest
 * @param id Unique request name
 * @param FindIn CtcFeedFileObjectFilter for CtcFeedFileFindRequest
 *
 */
@JsonCreator
  public CtcFeedFileFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcFeedFile")CtcFeedFileObjectFilter FindIn) {
    super(id, "CtcFeedFileFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcFeedFile", CtcFeedFileObjectHelper.toMap(FindIn, new HashMap(), "CtcFeedFile").get("CtcFeedFile"));
    }
  }

/**
 *
 * Retrieves the CtcFeedFileObjectDataList that results from the CtcFeedFileFindRequest call
 * @return CtcFeedFileObjectDataList resulting from udt call
 *
 */

  public CtcFeedFileObjectDataList getOutput() {
    return CtcFeedFileObjectHelper.fromMapList(outputMap, "CtcFeedFileList");
  }
}
