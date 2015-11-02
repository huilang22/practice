/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DtTypeRefGetBulkUdtTemplateItem.java
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
 * Class used to create a DtTypeRefGetBulkUdtTemplateItem Bulk Template
 *
 */

public class DtTypeRefGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DocumentTypeRefObjectKeyData DocTypeRefFindIn;
/**
 *
 * Constructor to create a  DtTypeRefGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DtTypeRefGetBulkUdtTemplateItem(String id, BSDMSessionContext context, DocumentTypeRefObjectKeyData DocTypeRefFindInIn) {
    super(id, context, "DtTypeRefGet");
    DocTypeRefFindIn = DocTypeRefFindInIn;
  }

  public void translateToMap() {
    if (DocTypeRefFindIn != null) {
      DocTypeRefFindIn.resetFlags(true, true);
      addInput("DocumentTypeRef", DocumentTypeRefObjectKeyHelper.toMap(DocTypeRefFindIn, new HashMap(), "DocumentTypeRefObjectKeyData").get("DocumentTypeRefObjectKeyData"));
    }
  }


/**
 *
 * Sets the DocumentTypeRef
 * @param DocTypeRefFindInIn Value of the DocTypeRefFindIn
 *
 */

  public void setDocumentTypeRef(DocumentTypeRefObjectKeyData DocTypeRefFindInIn) {
    DocTypeRefFindIn = DocTypeRefFindInIn;
  }

  public void translateFromMap() {
    DocTypeRefFindIn = DocumentTypeRefObjectKeyHelper.fromMap(inputMap, "DocumentTypeRef");
  }

/**
 *
 * Gets the DocumentTypeRef
 * @return Value of the DocumentTypeRef
 *
 */

  public DocumentTypeRefObjectKeyData getDocumentTypeRef( ) {
    return DocTypeRefFindIn;
  }

}
