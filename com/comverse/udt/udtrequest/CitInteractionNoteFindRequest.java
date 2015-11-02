/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitInteractionNoteFindRequest.java
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

import com.csgsystems.cit.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CitInteractionNoteFindRequest Udt Request
 *
 */

public class CitInteractionNoteFindRequest extends CitInteractionRequest {
/**
 *
 * Constructor to create a  CitInteractionNoteFindRequest
 * @param id Unique request name
 * @param citInteractionNoteFindIn CitInteractionNoteObjectFilter for CitInteractionNoteFindRequest
 *
 */
@JsonCreator
  public CitInteractionNoteFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitInteraction")CitInteractionNoteObjectFilter citInteractionNoteFindIn) {
    super(id, "CitInteractionNoteFind");
    if (citInteractionNoteFindIn != null) {
      Integer index =  citInteractionNoteFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitInteraction", CitInteractionNoteObjectHelper.toMap(citInteractionNoteFindIn, new HashMap(), "CitInteraction").get("CitInteraction"));
    }
  }

/**
 *
 * Retrieves the CitInteractionNoteObjectDataList that results from the CitInteractionNoteFindRequest call
 * @return CitInteractionNoteObjectDataList resulting from udt call
 *
 */

  public CitInteractionNoteObjectDataList getOutput() {
    return CitInteractionNoteObjectHelper.fromMapList(outputMap, "CitInteractionList");
  }
}
