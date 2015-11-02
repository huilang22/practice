/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTextFindBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a NoteTextFindBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteTextFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteTextObjectFilter NoteTextFindIn;
/**
 *
 * Constructor to create a  NoteTextFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteTextFindBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTextObjectFilter NoteTextFindInIn) {
    super(id, context, "NoteTextFind");
    NoteTextFindIn = NoteTextFindInIn;
  }

  public void translateToMap() {
    if (NoteTextFindIn != null) {
      Integer index =  NoteTextFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NoteText", NoteTextObjectHelper.toMap(NoteTextFindIn, new HashMap(), "NoteText").get("NoteText"));
    }
  }


/**
 *
 * Sets the NoteText
 * @param NoteTextFindInIn Value of the NoteTextFindIn
 *
 */

  public void setNoteText(NoteTextObjectFilter NoteTextFindInIn) {
    NoteTextFindIn = NoteTextFindInIn;
  }

  public void translateFromMap() {
    NoteTextFindIn = NoteTextObjectHelper.fromMapFilter(inputMap, "NoteText");
  }

/**
 *
 * Gets the NoteText
 * @return Value of the NoteText
 *
 */

  public NoteTextObjectFilter getNoteText( ) {
    return NoteTextFindIn;
  }

}
