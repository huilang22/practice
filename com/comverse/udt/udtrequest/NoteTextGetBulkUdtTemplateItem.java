/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTextGetBulkUdtTemplateItem.java
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
 * Class used to create a NoteTextGetBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteTextGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteTextObjectKeyData NoteTextGetIn;
/**
 *
 * Constructor to create a  NoteTextGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteTextGetBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTextObjectKeyData NoteTextGetInIn) {
    super(id, context, "NoteTextGet");
    NoteTextGetIn = NoteTextGetInIn;
  }

  public void translateToMap() {
    if (NoteTextGetIn != null) {
      NoteTextGetIn.resetFlags(true, true);
      addInput("NoteText", NoteTextObjectKeyHelper.toMap(NoteTextGetIn, new HashMap(), "NoteTextObjectKeyData").get("NoteTextObjectKeyData"));
    }
  }


/**
 *
 * Sets the NoteText
 * @param NoteTextGetInIn Value of the NoteTextGetIn
 *
 */

  public void setNoteText(NoteTextObjectKeyData NoteTextGetInIn) {
    NoteTextGetIn = NoteTextGetInIn;
  }

  public void translateFromMap() {
    NoteTextGetIn = NoteTextObjectKeyHelper.fromMap(inputMap, "NoteText");
  }

/**
 *
 * Gets the NoteText
 * @return Value of the NoteText
 *
 */

  public NoteTextObjectKeyData getNoteText( ) {
    return NoteTextGetIn;
  }

}
