/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTemplateFindNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a NoteTemplateFindNoOpRequest Udt Request/Response
 *
 */
public class NoteTemplateFindNoOpRequest extends NoteTemplateRequest {
/**
 *
 * Constructor to create a   NoteTemplateFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NoteTemplateFindNoOpRequest(String id, NoteTemplateObjectDataList noOpIn) {
    super(id, "NoteTemplateFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = NoteTemplateObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NoteTemplate", noOpIn);
      }
      addInput("NoteTemplate", mapList);
    }
  }
/**
 *
 * Retrieves the NoteTemplateObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public NoteTemplateObjectDataList getOutput() {
    return NoteTemplateObjectHelper.fromMapList(outputMap, "NoteTemplateList");
  }
}
