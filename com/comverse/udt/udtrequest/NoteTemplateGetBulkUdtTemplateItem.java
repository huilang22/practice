/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTemplateGetBulkUdtTemplateItem.java
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
 * Class used to create a NoteTemplateGetBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteTemplateGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteTemplateObjectKeyData NoteTemplateGetIn;
/**
 *
 * Constructor to create a  NoteTemplateGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteTemplateGetBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTemplateObjectKeyData NoteTemplateGetInIn) {
    super(id, context, "NoteTemplateGet");
    NoteTemplateGetIn = NoteTemplateGetInIn;
  }

  public void translateToMap() {
    if (NoteTemplateGetIn != null) {
      NoteTemplateGetIn.resetFlags(true, true);
      addInput("NoteTemplate", NoteTemplateObjectKeyHelper.toMap(NoteTemplateGetIn, new HashMap(), "NoteTemplateObjectKeyData").get("NoteTemplateObjectKeyData"));
    }
  }


/**
 *
 * Sets the NoteTemplate
 * @param NoteTemplateGetInIn Value of the NoteTemplateGetIn
 *
 */

  public void setNoteTemplate(NoteTemplateObjectKeyData NoteTemplateGetInIn) {
    NoteTemplateGetIn = NoteTemplateGetInIn;
  }

  public void translateFromMap() {
    NoteTemplateGetIn = NoteTemplateObjectKeyHelper.fromMap(inputMap, "NoteTemplate");
  }

/**
 *
 * Gets the NoteTemplate
 * @return Value of the NoteTemplate
 *
 */

  public NoteTemplateObjectKeyData getNoteTemplate( ) {
    return NoteTemplateGetIn;
  }

}
