/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a NoteTypeFindNoOpRequest Udt Request/Response
 *
 */
public class NoteTypeFindNoOpRequest extends NoteTypeRequest {
/**
 *
 * Constructor to create a   NoteTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NoteTypeFindNoOpRequest(String id, NoteTypeObjectDataList noOpIn) {
    super(id, "NoteTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = NoteTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NoteType", noOpIn);
      }
      addInput("NoteType", mapList);
    }
  }
/**
 *
 * Retrieves the NoteTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public NoteTypeObjectDataList getOutput() {
    return NoteTypeObjectHelper.fromMapList(outputMap, "NoteTypeList");
  }
}
