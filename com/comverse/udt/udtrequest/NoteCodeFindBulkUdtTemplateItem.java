/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteCodeFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a NoteCodeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteCodeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteCodeObjectFilter NoteCodeFindIn;
/**
 *
 * Constructor to create a  NoteCodeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteCodeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteCodeObjectFilter NoteCodeFindInIn) {
    super(id, context, "NoteCodeFind");
    NoteCodeFindIn = NoteCodeFindInIn;
  }

  public void translateToMap() {
    if (NoteCodeFindIn != null) {
      Integer index =  NoteCodeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NoteCode", NoteCodeObjectHelper.toMap(NoteCodeFindIn, new HashMap(), "NoteCode").get("NoteCode"));
    }
  }


/**
 *
 * Sets the NoteCode
 * @param NoteCodeFindInIn Value of the NoteCodeFindIn
 *
 */

  public void setNoteCode(NoteCodeObjectFilter NoteCodeFindInIn) {
    NoteCodeFindIn = NoteCodeFindInIn;
  }

  public void translateFromMap() {
    NoteCodeFindIn = NoteCodeObjectHelper.fromMapFilter(inputMap, "NoteCode");
  }

/**
 *
 * Gets the NoteCode
 * @return Value of the NoteCode
 *
 */

  public NoteCodeObjectFilter getNoteCode( ) {
    return NoteCodeFindIn;
  }

}
