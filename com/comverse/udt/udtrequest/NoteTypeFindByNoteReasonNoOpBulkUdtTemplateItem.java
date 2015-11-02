/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeFindByNoteReasonNoOpBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a NoteTypeFindByNoteReasonNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NoteTypeFindByNoteReasonNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NoteTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   NoteTypeFindByNoteReasonNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NoteTypeFindByNoteReasonNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTypeObjectDataList noOpInIn) {
    super(id, context, "NoteTypeFindByNoteReason");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = NoteTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NoteType", noOpIn);
      }
      addInput("NoteType", mapList);
    }
  }
/**
 *
 * Sets the  NoteType
 * @param noOpInIn NoteTypeObjectDataList to set
 *
 */
  public void setNoteType(NoteTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NoteType passed into the constructor
 * @return Simulated response
 *
 */
  public NoteTypeObjectDataList getNoteType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NoteTypeObjectHelper.fromMapList(inputMap, "NoteTypeList");
  }
}
